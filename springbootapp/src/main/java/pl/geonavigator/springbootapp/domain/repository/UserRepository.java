package pl.geonavigator.springbootapp.domain.repository;

import pl.geonavigator.springbootapp.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    String save(User user);
    Optional<User> findByUsername(String username);

    User findById(Long id);

    List<User> getAll();
    void create(User user);
    void delete(User user);

    void update(User user);
}
