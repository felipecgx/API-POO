    package com.jogos.api.controller;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.GeralEntity;
    import com.jogos.api.repository.GameRepository;
    import com.jogos.api.repository.UserRepository;
    import com.jogos.api.service.GameService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.ArrayList;
    import java.util.List;

    @RestController
    public class GameController {

        @Autowired
        private GameRepository repository;

        @Autowired
        private GameService service;

        @Autowired
        private UserRepository userRepository;

        @GetMapping("/getGame")
        public List<GameDTO> getGame(@RequestBody UserDTO Login){
            int retorno;
            List<GameDTO> vazio = new ArrayList<>();

            retorno = userRepository.conferer(Login);

            if(retorno == 0){
                return vazio;
            }

            List<GameDTO> dtos= service.getGames();

            return dtos;
        }

        @PostMapping("/postGame")
        public String postGame(@RequestBody GeralEntity Enty){

            int retorno;
            int retorno1;

            retorno = userRepository.confererADM(Enty.getLogin());

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }
            ////

            retorno1 = service.validation(Enty.getGame());

            if(retorno1 == 1){

                return "Id inválido";

            }else if(retorno1 == 2){

                return "Quantidade de pessoas negativas não pode";

            }else if(retorno1 == 3){

                return "Número de copias negativas não pode";
            }


            repository.save(Enty.getGame());

            return "Jogo adicionado com sucesso";
            ////
        }

        @DeleteMapping("/deleteGame/{id}")
        public String deleteGame(@PathVariable int id, @RequestBody UserDTO user){

            int retorno;

            retorno = userRepository.confererADM(user);

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }

            repository.delete(id);

            return "Jogo deletado com sucesso";
        }

        @PutMapping("/updateGame/{id}")
        public String updateGame(@PathVariable int id, @RequestBody GeralEntity Enty){

            int retorno;

            retorno = userRepository.confererADM(Enty.getLogin());

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }

            repository.update(id, Enty.getGame());

            return "Os dados do jogo foram atualizados";
        }

    }

