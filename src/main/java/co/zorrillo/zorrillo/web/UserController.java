package co.zorrillo.zorrillo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.zorrillo.zorrillo.model.User;
import co.zorrillo.zorrillo.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {
    /**
    * generar tablas
    */
    @Autowired
    /**
    * servicio
    */
    private UserService userService;
    /**
    * peticion get
    */
    @GetMapping("/all")
    /**
    * lista
    */
    public List<User> getAll() {
        return userService.getAll();
    }
    /**
    * peticion post
    */
    @PostMapping("/new")
    /**
    * status
    */
    @ResponseStatus(HttpStatus.CREATED)
    /**
    * crear usuario
    */
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    /**
    * peticion put
    */
    @PutMapping("/update")
    /**
    * status
    */
    @ResponseStatus(HttpStatus.CREATED)
    /**
    * actualizar usuario
    */
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    /**
    * peticion delete
    */
    @DeleteMapping("/{id}")
    /**
    * status
    */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    /**
    * borrar
    */
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }
    /**
    * peticion get
    */
    @GetMapping("/{email}/{password}")
    /**
    * autenticar usuario
    */
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }
    /**
    * peticion get
    */
    @GetMapping("/emailexist/{email}")
    /**
    * veriricar email
    */
    public boolean emailExist(@PathVariable("email") String email) {
        return userService.emailExist(email);
    }
}
