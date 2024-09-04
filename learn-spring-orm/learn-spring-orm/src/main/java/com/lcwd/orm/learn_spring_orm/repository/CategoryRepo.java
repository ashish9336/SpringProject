package com.lcwd.orm.learn_spring_orm.repository;

import com.lcwd.orm.learn_spring_orm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {

}
