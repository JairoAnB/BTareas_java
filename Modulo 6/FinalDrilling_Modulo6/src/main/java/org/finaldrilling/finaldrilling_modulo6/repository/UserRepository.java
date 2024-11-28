package org.finaldrilling.finaldrilling_modulo6.repository;

import org.finaldrilling.finaldrilling_modulo6.dto.UserDTO;
import org.finaldrilling.finaldrilling_modulo6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User>findByUsername(String username);
}
