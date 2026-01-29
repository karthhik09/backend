/**
 * User Repository
 * Handles db operations for users
 */

package com.todo.todo_app.repository;

import com.todo.todo_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Find user by email
    Optional<User> findByEmail(String email);
}