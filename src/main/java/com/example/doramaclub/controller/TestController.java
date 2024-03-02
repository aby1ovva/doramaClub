package com.example.doramaclub.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "*")
public class TestController {

    @GetMapping("/all")
    public String getAll() {
        return "public API";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN') or hasRole('MANAGER')")
    public String getUserApi() {
        return "User API";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String getAdminApi() {
        return "Admin API";
    }

    @GetMapping("/superadmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getSuperAdminApi() {
        return "SuperAdmin API";
    }

    @GetMapping("/role")
    public String getAccountRole() {
        // Получение информации об аутентификации из SecurityContextHolder
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Проверка наличия аутентификации и получение роли
        if (authentication != null && authentication.getAuthorities() != null && !authentication.getAuthorities().isEmpty()) {
            return authentication.getAuthorities().iterator().next().getAuthority();
        }

        // Если роль не найдена (например, пользователь не аутентифицирован), возвращаем сообщение
        return "Role not found";
    }
}


