package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByStatus(String status);
}
