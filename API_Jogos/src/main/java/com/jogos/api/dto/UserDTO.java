    package com.jogos.api.dto;

    public class UserDTO {

        private String name;
        private String email;
        private String password;

        // UserDTO x = new UserDTO(1, "kenninston", "kenninston@iesb.edu.br", 12345);
        public UserDTO(Long id, String name, String email, String senha){
            //this.id = id; (o valor do id da classe vai virar o valor do id recebido na função
            //this.name= name;
            //...

            //construtor
        }


        // todos os gets e sets também são exemplos de encapsulamento
        // métodos public/private/protected

        //get ID?
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
