package pl.geonavigator.springbootapp.domain.model.dto;

import pl.geonavigator.springbootapp.domain.model.User;
import pl.geonavigator.springbootapp.domain.model.role.Role;

public record CreateUserDto(String username, String password, Role role) {
    public User toUser() {
        return User
                .builder()
                .username(username)
                .password(password)
                .role(role)
                .build();
    }
}
