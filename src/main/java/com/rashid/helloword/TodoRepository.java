package com.rashid.helloword;

import com.rashid.helloword.models.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//@Bean
//@Component

// CRUD

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
