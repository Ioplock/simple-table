package net.ioplock.table.service;

import net.ioplock.table.dto.UserRegistrationDto;
import net.ioplock.table.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
} 