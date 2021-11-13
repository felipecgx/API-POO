    package com.jogos.api.model;

    import javax.persistence.*;
    import java.util.Date;

    //classes que representam tabelas no banco de dados

    //usar camelCase

    //Model é o modelo de banco de dados
    @Entity(name="Game-Entity")
    public class GameEntity{// A entidade para definir as informações do bagulho

        @Id
        private int id_jogo;

        //não é necessário pois pega o nome automaticamente
       // @Column(name="name") //nome da coluna no banco de dados
        private String name;
        private double price;
        private String requirements;
        private String description;
        private String developer;
        private String distributor;
        private int score;
        private String genre;
        private String DLC;
        private int rating;//faixa etária

        @Column(name= "Release_Date") //para mudar o nome na tabela do banco de dados
        private Date releaseDate;

        @Column(name="People_Involved")
        private int peopleInvolved;

        @Column(name="Sold_Copies")
        private int soldCopies;

        public GameEntity(){

        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDeveloper() {
            return developer;
        }

        public void setDeveloper(String developer) {
            this.developer = developer;
        }

        public int getPeopleInvolved() {
            return peopleInvolved;
        }

        public void setPeopleInvolved(int peopleInvolved) {
            this.peopleInvolved = peopleInvolved;
        }

        public int getSoldCopies() {
            return soldCopies;
        }

        public void setSoldCopies(int soldCopies) {
            this.soldCopies = soldCopies;
        }

        public String getDistributor() {
            return distributor;
        }

        public void setDistributor(String distributor) {
            this.distributor = distributor;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDLC() {
            return DLC;
        }

        public void setDLC(String DLC) {
            this.DLC = DLC;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getRequirements() {
            return requirements;
        }

        public void setRequirements(String requirements) {
            this.requirements = requirements;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId_jogo() {
            return id_jogo;
        }

        public void setId_jogo(int id_jogo) {
            this.id_jogo = id_jogo;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }
    }