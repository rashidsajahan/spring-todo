package com.rashid.helloword.repository;

import com.rashid.helloword.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//@Bean
//@Component

// CRUD

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
