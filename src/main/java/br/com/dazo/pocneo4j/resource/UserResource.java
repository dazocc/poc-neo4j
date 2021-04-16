package br.com.dazo.pocneo4j.resource;

import br.com.dazo.pocneo4j.model.User;
import br.com.dazo.pocneo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> listar() {
        List<User> listUser = userService.listar();

        return ResponseEntity.status(HttpStatus.OK).body(listUser);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> buscar(@PathVariable Long id) {

        User user = userService.buscarPorId(id);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping
    public ResponseEntity<User> salvar(@RequestBody User user) {

        user = userService.salvar(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> atualizar(@RequestBody User user, @PathVariable Long id) {

        userService.atualizar(user, id);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        userService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
