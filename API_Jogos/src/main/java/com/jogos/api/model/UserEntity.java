    package com.jogos.api.model;

    import javax.persistence.*;

    //banco de dados H2
    //ir no resources->application.properties

    //representa uma tabela
    @Entity
    @Table(name = "Users")
    public class UserEntity{

        //vincular as classes entity para representar cada instancia da classe (cada objeto)
        //para representar uma linha no banco de dados
        @Column(name = "NAME", nullable = false)
        private String name;

        @Column(name = "EMAIL", nullable = false)
        private String email;

        @Column(name = "SENHA", nullable = false)
        private String password;

        @Id
        @Column(name= "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment
        private Long id;

        //vinculado a tabela



        //gets e sets para acessar os campos PRIVATE (encapsulamento)
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
