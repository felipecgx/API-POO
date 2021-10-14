package com.jogos.api.repository;

import com.jogos.api.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//abstract porque não tem todas as informações necessárias para ser classificada como objeto(não pode ter objeto)
//interface é uma classe 100% abstrata
public interface UserInterfaceRepository extends CrudRepository<UserEntity, Long> { //herança
    //CRUD= Create, Read, Update, Delete (tudo da user entity)
    //ganha métodos para fazer o banco de dados (escreve o sql automaticamente)
    //ler documentação do spring

    /*
    Referencia Spring Data:
        https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
 */

    Optional<List<UserEntity>> findByNameContaining(String name);
}
