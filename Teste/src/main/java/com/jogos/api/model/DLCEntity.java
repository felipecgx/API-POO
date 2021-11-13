    package com.jogos.api.model;

    import javax.persistence.*;
    import java.util.Date;

    @Entity
    public class DLCEntity extends GameEntity{

        @Column(name="Owned_Game")
        public String ownedGame;


    }