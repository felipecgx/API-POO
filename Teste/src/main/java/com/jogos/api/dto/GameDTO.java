    package com.jogos.api.dto;

    import com.fasterxml.jackson.annotation.JsonProperty;

    import java.time.LocalDate;


    public class GameDTO {

        @JsonProperty
        private String name;

        @JsonProperty("Game_Id")
        private int idJogo;

        public GameDTO(String name, int idJogo) {
            this.name = name;
            this.idJogo = idJogo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIdJogo() {
            return idJogo;
        }

        public void setIdJogo(int idJogo) {
            this.idJogo = idJogo;
        }
    }
