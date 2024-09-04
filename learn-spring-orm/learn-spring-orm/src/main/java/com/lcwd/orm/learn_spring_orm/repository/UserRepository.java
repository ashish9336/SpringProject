package com.lcwd.orm.learn_spring_orm.repository;

import com.lcwd.orm.learn_spring_orm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
