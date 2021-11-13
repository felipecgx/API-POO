    package com.jogos.api.dto;

    import com.fasterxml.jackson.annotation.JsonProperty;

    import javax.persistence.Column;
    import java.util.Date;

    //classes para converter para Json


    public class GameDTO {

        //não é necessário pois pega o nome automaticamente
        // @Column(name="name") //nome da coluna no banco de dados
        private String name;//
        private double price;//
        private String requirements;//
        private String description;//
        private String developer;//
        private String distributor;//
        private int score;//
        private String genre;//
        private String DLC;//
        private int rating;//faixa etária

        @Column(name= "Release_Date") //para mudar o nome na tabela do banco de dados
        private Date releaseDate;//

        @Column(name="People_Involved")
        private int peopleInvolved;//

        @Column(name="Sold_Copies")
        private int soldCopies;//



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getRequirements() {
            return requirements;
        }

        public void setRequirements(String requirements) {
            this.requirements = requirements;
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

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
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



    }
