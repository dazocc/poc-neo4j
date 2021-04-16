package br.com.dazo.pocneo4j.service;

import br.com.dazo.pocneo4j.model.User;
import br.com.dazo.pocneo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.findAll();
    }
}
