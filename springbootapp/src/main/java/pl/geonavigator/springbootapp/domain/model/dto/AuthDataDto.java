package pl.geonavigator.springbootapp.domain.model.dto;

import pl.geonavigator.springbootapp.domain.model.role.Role;

public record AuthDataDto(String username, Role role) {
}
