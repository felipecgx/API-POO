    package com.jogos.api.service;

    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.model.GameEntity;
    import com.jogos.api.repository.GameRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;

    @Service

    public class GameService{

        @Autowired
        private GameRepository repository;

        public List<GameDTO> getGames() {
            List<GameDTO> ListGames = new ArrayList<>();

            List<GameEntity> games = repository.get();

            for(int i = 0; i < games.size();i++){
                GameEntity tmp = games.get(i);

                GameDTO dto = new GameDTO();
                dto.setName(tmp.getName());
                dto.setReleaseDate(tmp.getReleaseDate());//
                dto.setDescription(tmp.getDescription());//nao precisa
                dto.setDeveloper(tmp.getDeveloper());//
                dto.setDistributor(tmp.getDistributor());//nao
                dto.setScore(tmp.getScore());//
                dto.setPrice(tmp.getPrice());//
                dto.setRequirements(tmp.getRequirements());//nao precisa
                dto.setGenre(tmp.getGenre());
                dto.setDLC(tmp.getDLC());//nao precisa
                dto.setRating(tmp.getRating());//

                ListGames.add(dto);
            }

            return ListGames;
        }

        public int validation(GameEntity Enty){

            if(Enty.getId() < 0){//se for negativo da erro
                return 1;
            }

            if(Enty.getPeopleInvolved() < 1){
                return 2;
            }

            if(Enty.getSoldCopies() < 0){
                return 3;
            }

            if(Enty.getScore() < 0 || Enty.getScore() > 100){
                return 4;
            }

            if(Enty.getPrice() < 0){
                return 5;
            }

            if(Enty.getRating()<0 && Enty.getRating()>21){//
                return 6;
            }

            if(Enty.getGenre().isEmpty()){
                return 7;
            }

            if(Enty.getDeveloper().isEmpty()){
                return 8;
            }

            if(Enty.getName().isEmpty()){
                return 10;
            }



            return 0;
        }

    }
