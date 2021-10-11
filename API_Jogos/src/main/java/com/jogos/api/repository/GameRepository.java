    package com.jogos.api.repository;

    import com.jogos.api.model.GameEntity;
    import org.springframework.stereotype.Repository;

    import java.util.ArrayList;
    import java.util.List;

    @Repository

    public class GameRepository {

        private List<GameEntity> ListGames= new ArrayList<>();

        public List<GameEntity> get(){
            //Consulta no Banco de Dados os produtos do tipo game

            return ListGames;
        }

        public void save(GameEntity game){
            //Grava os dados do novo jogo no banco de dados



            ListGames.add(game);

        }

        public void delete(int iden){
            //REMOVER O REGISTRO DO BANCO DE DADOS BASEADO NO IDENTIFICADO UNICO

            for(int i = 0; i < ListGames.size(); i++){
                GameEntity tmp = ListGames.get(i);

                if(tmp.getId() == iden){
                    ListGames.remove(i);
                }
            }
        }

        public void update(int iden, GameEntity game){

            for(int i = 0; i < ListGames.size(); i++){// atualiza os dados de tudo num jogo pelos SETS
                GameEntity tmp = ListGames.get(i);

                if(tmp.getId() == iden){
                    tmp.setId(game.getId());
                    tmp.setName(game.getName());
                    tmp.setReleaseDate(game.getReleaseDate());
                    tmp.setDescription(game.getDescription());
                    tmp.setDeveloper(game.getDeveloper());
                    tmp.setPeopleInvolved(game.getPeopleInvolved());
                    tmp.setSoldCopies(game.getSoldCopies());
                    tmp.setDistributor(game.getDistributor());
                    tmp.setScore(game.getScore());
                    tmp.setPrice(game.getPrice());
                    tmp.setRequirements(game.getRequirements());
                    tmp.setGenre(game.getGenre());
                    tmp.setDLC(game.getDLC());
                    tmp.setRating(game.getRating());
                }

            }
        }
    }


