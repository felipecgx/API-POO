    package com.jogos.api.controller;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import com.jogos.api.repository.UserInterfaceRepository;
    import com.jogos.api.repository.UserRepository;
    import com.jogos.api.service.UserService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    public class UserController {

        @Autowired
        private UserService service;

        @Autowired
        private UserRepository repository;

        @Autowired
        private UserInterfaceRepository repo;

        @PostMapping("/signup")
        public String signup(@RequestBody UserDTO User){
            int retorno;
            UserEntity Entity;

            retorno = service.signup(User);

            if(retorno == 1){
                return "Nome invalido";
            }else if(retorno == 2){
                return "email invalido";
            }else if(retorno == 3){
                return "senha muito curta";
            }

            return "Usuario adicionado";
        }

        @PostMapping("/login")
        public String login(@RequestBody UserDTO User) {

            int retorno;
            //retorno = repository.login(User);
            retorno = service.login(User);

            if (retorno == 1 || retorno == 3) {
                return "Login incorreto usuario não encontrado";
            }else{
                return "Login efetuado com sucesso";
            }

        }


        //retornar lista de usuários
        /*@GetMapping("Users")
        public ResponseEntity<List<UserDTO>> getUsers(@RequestParam(required = false)String name){
            List<UserDTO> lista = service.getUsers(name);
            if (lista.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(lista);
        }*/

    }
