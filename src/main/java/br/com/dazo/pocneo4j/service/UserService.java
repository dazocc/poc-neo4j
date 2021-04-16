package br.com.dazo.pocneo4j.service;

import br.com.dazo.pocneo4j.model.User;
import br.com.dazo.pocneo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> listar() {
        return userRepository.findAll();
    }

    public User buscarPorId(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    public User salvar(User user) {
        return userRepository.save(user);
    }

    public void atualizar(User user, Long id) {

        User userBanco = buscarPorId(id);

        if(userBanco != null){
            userBanco.setName(user.getName());
            userBanco.setAge(user.getAge());

            userRepository.save(userBanco);
        }
    }

    public void deletar(Long id) {
        userRepository.deleteById(id);
    }
}
