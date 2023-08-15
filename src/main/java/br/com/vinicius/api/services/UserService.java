package br.com.vinicius.api.services;

import br.com.vinicius.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
