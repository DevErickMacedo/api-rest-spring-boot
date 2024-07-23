package macedo.erick.domain.service;

import macedo.erick.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
