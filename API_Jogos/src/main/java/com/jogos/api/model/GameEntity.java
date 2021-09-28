    package com.jogos.api.model;

    import java.util.Date;
    import java.util.List;

    public class GameEntity {

        //foto
        private int id;
        private String name;
        private String releaseDate;
        private String description;
        private String developer;
        private int peopleInvolved;
        private int soldCopies;
        private String distributor;
        private int score;
        private float price;
        private List<String> requirements;
        private String genre;
        private List<String> DLC;
        private int rating;//faixa etária

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public List<String> getRequirements() {
            return requirements;
        }

        public void setRequirements(List<String> requirements) {
            this.requirements = requirements;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public List<String> getDLC() {
            return DLC;
        }

        public void setDLC(List<String> DLC) {
            this.DLC = DLC;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
