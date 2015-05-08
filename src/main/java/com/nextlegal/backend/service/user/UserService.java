package com.nextlegal.backend.service.user;

import com.nextlegal.backend.domain.User;
import com.nextlegal.backend.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
