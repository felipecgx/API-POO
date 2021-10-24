    package com.jogos.api.dto;

    import java.util.Date;

    public class GameDTO {

        private String name;
        private Date releaseDate;
        private String description;
        private String developer;
        private String distributor;
        private int score;
        private float price;
        private String genre;
        private int rating;
        private boolean hasDLC;

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

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }

        public boolean isHasDLC() {
            return hasDLC;
        }

        public void setHasDLC(boolean hasDLC) {
            this.hasDLC = hasDLC;
        }
    }
