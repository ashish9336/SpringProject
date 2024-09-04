package com.lcwd.electronic.store.services.impl;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.UserDto;
import com.lcwd.electronic.store.entities.User;
import com.lcwd.electronic.store.exceptions.ResourceNotFoundException;
import com.lcwd.electronic.store.repositories.UserRepository;
import com.lcwd.electronic.store.services.UserService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;
    private int pageSize;
    @Value("${user.profile.image.path}")
    private String imagePath;
    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserDto createUser(UserDto userDto) {
        // Generate unique ID
        String stringId = UUID.randomUUID().toString();
        userDto.setUserId(stringId);

        // Convert DTO to entity
        User user = dtoToEntity(userDto);

        // Save the user
        User savedUser = userRepository.save(user);

        // Convert saved entity back to DTO
        return entityDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, String userId) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        // Check if new name already exists
        if (!existingUser.getName().equals(userDto.getName()) &&
                userRepository.existsByName(userDto.getName())) {
            throw new ResourceNotFoundException("A user with this name already exists");
        }

        existingUser.setName(userDto.getName());
        existingUser.setEmail(userDto.getEmail());
        existingUser.setAbout(userDto.getAbout());
        existingUser.setGender(userDto.getGender());
        existingUser.setPassword(userDto.getPassword());
        existingUser.setImageName(userDto.getImageName());

        User updatedUser = userRepository.save(existingUser);
        return mapper.map(updatedUser, UserDto.class);
    }


    @Override
    /*public void deleteUser(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("UserId not found"));
       //delete user profile image
//        image/user/abc.png
        String fullPath =imagePath + user.getImageName();
        Files.delete(path);
       try {
           Path path = Paths.get(fullPath);
           Files.delete(path);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

        //delete user
        userRepository.delete(user);
    }*/


    public void deleteUser(String userId) {
        // Fetch the user or throw an exception if not found
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("UserId not found"));

        // Construct the full path to the user's profile image
        String imagePath = "images/users/";  // Ensure this is correctly defined or passed as a parameter
        String fullPath = Paths.get(imagePath, user.getImageName()).toString();
        Path path = Paths.get(fullPath);

        // Delete the user profile image
        try {
            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("Profile image deleted successfully.");
            } else {
                System.out.println("Profile image does not exist.");
            }
        } catch (IOException e) {

            logger.info("user image not found ");
            e.printStackTrace();
            throw new RuntimeException("Error deleting profile image: " + e.getMessage(), e);
        }

        // Delete the user from the repository
        userRepository.delete(user);
    }



    @Override
    public PageableResponse<UserDto> getAllUser(int pageNumber, int Size, String sortBy, String sortDir) {
        // pageNumber default starts from 0
        pageSize = Math.max(1, pageSize);
        Sort sort = (sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()) :(Sort.by(sortBy).ascending()) ;
        Pageable pageable= PageRequest.of(pageNumber,pageSize,sort);
        Page<User> page = userRepository.findAll(pageable);
        List<User> users = page.getContent();

        PageableResponse<UserDto> response = new PageableResponse<>();
       // response.setContent(UserDto);
        response.setPageNumber(pageNumber);
        response.setPageSize(pageSize);
        response.setTotalElements(page.getTotalElements());
        response.setTotalPages(page.getTotalPages());
        //response.setLast(page.isLast());

        return response;
        //return users.stream().map(this::entityDto).collect(Collectors.toList());
    }

    @Override
    public UserDto getUserById(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user not found with given id !!"));
        return entityDto(user);
    }

    @Override
    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("User Not found with given email id and password"));
        return entityDto(user);
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<User> users = userRepository.findByNameContaining(keyword);
        return users.stream().map(this::entityDto).collect(Collectors.toList());
    }

    private UserDto entityDto(User user) {
        return mapper.map(user, UserDto.class);
    }

    private User dtoToEntity(UserDto userDto) {
        return mapper.map(userDto, User.class);
    }
}
