package com.jpgedvila.gameList.entities;



import java.util.Objects;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

    @Entity
    @Table(name = "tb_game")
    public class Game{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        private String title;
        private String genre;

        @Column(name = "game_year")
        private Integer year;
        private String platforms;
        private Double score;
        private String imgUrl;

        @Column(columnDefinition = "TEXT")
        private String shortDescription;

        @Column(columnDefinition = "TEXT")
        private String longDescription;
        @jakarta.persistence.Id
        private Long id;

        public Game(Long id, String title, String genre, Integer year, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {

            this.Id = id;
            this.title = title;
            this.genre = genre;
            this.year = year;
            this.platforms = platforms;
            this.score = score;
            this.imgUrl = imgUrl;
            this.shortDescription = shortDescription;
            this.longDescription = longDescription;

        }

        public Game() {

        }

        public void setId(Long id) {
            this.Id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public void setPlatforms(String platforms) {
            this.platforms = platforms;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }

        public Long getId() {
            return this.Id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getGenre() {
            return this.genre;
        }

        public Integer getYear() {
            return this.year;
        }

        public String getPlatforms() {
            return this.platforms;
        }

        public Double getScore() {
            return this.score;
        }

        public String getImgUrl() {
            return this.imgUrl;
        }

        public String getShortDescription() {
            return this.shortDescription;
        }

        public String getLongDescription() {
            return this.longDescription;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Game other = (Game) obj;
            return Objects.equals(Id, other.Id);
        }

    }