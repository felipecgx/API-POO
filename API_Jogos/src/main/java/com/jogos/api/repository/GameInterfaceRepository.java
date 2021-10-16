package com.jogos.api.repository;

import com.jogos.api.model.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GameInterfaceRepository extends JpaRepository<GameEntity, Long> {



}
