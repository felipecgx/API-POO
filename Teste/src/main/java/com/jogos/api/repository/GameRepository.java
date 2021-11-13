    package com.jogos.api.repository;

    import com.jogos.api.model.GameEntity;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;


    //para ter acess ao banco de dados pelo GameEntity

    @Repository//marcações para ficar com instâncias automáticas
    public class GameRepository{

        public List<GameEntity> getGames(){
            //consultar os games no banco de dados

            //preenchido manualmente (sem Banco de Dados)
            //GameEntity games = new GameEntity();
            //games.setName("Elden Ring")...para todos

            //vetor de estruturas 'gameEntity'
            return new ArrayList<>();//retornando sem nada por enquanto
        }

        public void saveGames(GameEntity newGame){
            //adicionar jogo, gravar os dados do novo jogo no banco de dados


        }

        public void updateGame(GameEntity updateForGame){
            //1)recuperar o dado no banco de dados
            //2)alterar os dados em memória
            //3)gravar os dados alterados no banco de dados

        }

        public void deleteGame (int gameToDelete){//passou o id
            //remover o registro no banco de dados baseado no id do jogo

        }

    }


    ///n
    /*public interface GameRepository extends JpaRepository<GameEntity, Long> {

        Optional<GameEntity> findByName(String name);
    }
    */