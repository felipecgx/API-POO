    package com.jogos.api.repository;

    import com.jogos.api.model.GameEntity;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.Optional;


    //para ter acess ao banco de dados pelo GameEntity
    public interface GameRepository extends JpaRepository<GameEntity, Long> {

        Optional<GameEntity> findByName(String name);
    }
