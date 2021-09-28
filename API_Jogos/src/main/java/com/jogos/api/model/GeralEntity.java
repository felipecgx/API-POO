    package com.jogos.api.model;

    import com.jogos.api.dto.UserDTO;

    public class GeralEntity {

        private GameEntity game;
        private UserDTO login;

        public GameEntity getGame() {
            return game;
        }

        public void setGame(GameEntity game) {
            this.game = game;
        }

        public UserDTO getLogin() {
            return login;
        }

        public void setLogin(UserDTO login) {
            this.login = login;
        }
    }
