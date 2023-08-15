package br.com.vinicius.api.services;

import br.com.vinicius.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
