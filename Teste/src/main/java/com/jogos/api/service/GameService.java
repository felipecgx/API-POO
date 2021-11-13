    package com.jogos.api.service;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.model.GameEntity;
    import com.jogos.api.repository.GameRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;

    //regras de negócio

    //conversão entre entidade e DTO

    @Service
    public class GameService{

        @Autowired//instancia em tempo de compilação (faz o malloc automático)
        private GameRepository gameRepository; //pede para o repositório

        public List<GameDTO> getGame(){

            List<GameDTO> result = new ArrayList<>(); // não precisa pois tem autowired

            //gameRepository= new GameRepository();//cria o objeto EM MEMÓRIA (se tiver Autowired, não precisa, cria em compilação)

            List<GameEntity> games = gameRepository.getGames();//dá a lista de jogos (retorna TODOS os jogos)

            //converter
            for(int i=0; i<games.size(); i++){//percorre a lista de jogos
                GameEntity aux = games.get(i); //get vai pegar a posição específica
                GameDTO dto = new GameDTO();// criando um novo objeto DTO em memória

                // passar os dados do Entity pro DTO
                //dto.name não acessa pois tá private. ENCAPSULADo

                dto.setName(aux.getName()); //usar os gets e sets pra acessar as private
                dto.setDescription(aux.getDescription());
                //fazer para todos, conversão de dto
                dto.setDeveloper(aux.getDeveloper());
                dto.setGenre(aux.getGenre());
                dto.setPrice(aux.getPrice());
                dto.setDistributor(aux.getDistributor());
                dto.setRating(aux.getRating());
                dto.setRequirements(aux.getRequirements());
                dto.setReleaseDate(aux.getReleaseDate());
                dto.setScore(aux.getScore());
                dto.setPeopleInvolved(aux.getPeopleInvolved());
                dto.setSoldCopies(aux.getSoldCopies());
                dto.setDLC(aux.getDLC());

                result.add(dto); //armazenando a lista no resultado

            }
            return result;
        }



    }

