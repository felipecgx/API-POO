    package com.jogos.api.controller;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import com.jogos.api.repository.UserRepository;
    import com.jogos.api.service.UserService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class UserController {

        @Autowired
        private UserService service;

        @Autowired
        private UserRepository repository;

        @PostMapping("/signup")
        public String signup(@RequestBody UserDTO User){
            int retorno;

            retorno = service.signup(User);

            if(retorno == 1){
                return "Nome invalido";
            }else if(retorno == 2){
                return "email invalido";
            }else if(retorno == 3){
                return "senha muito curta";
            }

            repository.save(User);

            return "Usuario adicionado";
        }

        @PostMapping("/login")
        public String login(@RequestBody UserDTO User) {

            int retorno;

            retorno = repository.login(User);

            if (retorno == 1) {
                return "Usuario não encontrado";
            } else {
                return "Login efetuado com sucesso";
            }
        }

    }
