    package com.jogos.api.controller;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.model.GameEntity;
    import com.jogos.api.repository.GameRepository;
    import com.jogos.api.service.GameService;
    import com.jogos.api.service.UserService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;
    import java.util.ArrayList;
    import java.util.List;

    //endpoints
    public class GameController {
        //metodos que executam ações através da internet pela URL

        //expor os dados em URL

        //get->consulta
        //post->inclusão
        //put->atualizar
        //delete->remover

        //metodo que retorna lista de computadores
        public List<GameDTO> getGames(){ //vai devolver para internet por DTo, agora convertido
            GameService service = new GameService();//vai buscar pelo Service, que converteu o dto
            List<GameDTO> dto = service.getGame();//guardar numa variavel com uma lista
            return dto;

        }




}
