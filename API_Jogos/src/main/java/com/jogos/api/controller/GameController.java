    package com.jogos.api.controller;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.model.GameEntity;
    import com.jogos.api.repository.GameRepository;
    import com.jogos.api.repository.UserRepository;
    import com.jogos.api.service.GameService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    //Alt + Enter para importar uma parte de código necessária


    import java.util.ArrayList;
    import java.util.List;

    @RestController
    public class GameController {

        @Autowired //recomenda colocar num construtor
        private GameRepository repository;

        @Autowired
        private GameService service;

        @Autowired
        private UserRepository userRepository;

        @GetMapping("/getGame")
        public List<GameDTO> getGame(){
            int retorno;
            List<GameDTO> vazio = new ArrayList<>();

            retorno = userRepository.LoginConferer();

            if(retorno == 1){
                return vazio;
            }

            List<GameDTO> dtos= service.getGames();

            return dtos;
        }

        @PostMapping("/postGame")
        public String postGame(@RequestBody GameEntity game){ // exemplo de encapsulamento, método public

            int retorno;
            int retorno1;

            retorno = userRepository.LoginConferer();

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }

            retorno1 = service.validation(game);

            if(retorno1 == 1){
                return "Id inválido";
            }else if(retorno1 == 2){
                return "Não pode ter uma quantidade negativa de pessoas envolvidas";
            }else if(retorno1 == 3){
                return "Não pode ter número de cópias negativo";
            }else if(retorno1==4){
                return "A nota do jogo não pode ser negativa";
            }else if(retorno1==5){
                return "O preço do jogo não pode ser negativo";
            }else if(retorno1==6){
                return "A classificação indicativa não pode ser negativa e nem maior do que 21 anos";
            }else if(retorno1==7){
                return "O genero do jogo não pode estar vazio";
            } else if (retorno1==8){
                return "O jogo não pode ficar sem um developer";
            }else if(retorno1==10){
                return "O jogo não pode não ter um nome";
            }
            //jogo pode não ter descrição
            //jogo pode não mostrar requerimentos
            //jogo pode não ter releaseDate
            // (ver verificação da data de alguma maneira)


            repository.save(game);

            //se passar por todos os ifs, o jogo será adicionado com sucesso na lista
            return "Jogo adicionado com sucesso";

        }

        @DeleteMapping("/deleteGame/{id}")
        public String deleteGame(@PathVariable int id){ // exemplo de encapsulamento

            int retorno;

            retorno = userRepository.LoginConferer();

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }

            repository.delete(id);

            return "Jogo deletado com sucesso";
        }

        @PutMapping("/updateGame/{id}")
        public String updateGame(@PathVariable int id, @RequestBody GameEntity game){ //exemplo de encapsulamento

            int retorno;

            retorno = userRepository.LoginConferer();

            if(retorno == 0){
                return "Esse usuário não tem permição para esse comando";
            }

            repository.update(id, game);

            return "Os dados do jogo foram atualizados";
        }

    }
