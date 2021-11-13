    package com.jogos.api.controller;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.service.GameService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    //endpoints

    @RestController
    public class GameController {
        //metodos que executam ações através da internet pela URL

        //expor os dados em URL

        //get->consulta
        //post->inclusão
        //put->atualizar
        //delete->remover

        @Autowired
        private GameService service;//se liga no service


        //metodo que retorna lista de computadores

        @GetMapping("/games")
        public List<GameDTO> getGames(){ //vai devolver para internet por DTo, agora convertido
            //GameService service = new GameService();   //vai buscar pelo Service, que converteu o dto
            List<GameDTO> dto = service.getGame();//guardar numa variavel com uma lista
            //pega os dtos convertidos e RETORNA pra web
            return dto;//pra web

        }




}
