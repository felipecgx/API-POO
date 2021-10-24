    package com.jogos.api.model;

    import javax.persistence.*;
    import java.util.Date;

    @Entity
    @Table(name = "DLC")
    public class DLCEntity extends GameEntity { //HERANÇA COM EXTENDS

        // IGUAIS=   name/releaseDate/description/developer/peopleInvolved/soldCopies/distributor
        //           score/price/genre/rating

        // DIFERENTES=  id/ ownedGame  -> Game tem o hasDLC

        @Id
        @Column(name= "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "ownedGame", nullable = false)
        private String ownedGame;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "releaseDate", nullable = false)
        private Date releaseDate;

        @Column(name = "description", nullable = false)
        private String description;

        @Column(name = "developer", nullable = false)
        private String developer;

        @Column(name = "peopleInvolved", nullable = false)
        private int peopleInvolved;

        @Column(name = "soldCopies", nullable = false)
        private int soldCopies;

        @Column(name = "distributor", nullable = false)
        private String distributor;

        @Column(name = "score", nullable = false)
        private int score;

        @Column(name = "price", nullable = false, scale = 2)
        private Double price;

        @Column(name = "genre", nullable = false)
        private String genre;

        @Column(name = "rating", nullable = false)
        private int rating;



        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getOwnedGame() {
            return ownedGame;
        }

        public void setOwnedGame(String ownedGame) {
            this.ownedGame = ownedGame;
        }





        /*         NAO PRECISA

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
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

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
        */
    }
