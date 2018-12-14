package com.example.otalo.api2;

public class people {

        private String name;
        private String realname;
        private String team;
        private String firstappearance;
        private String createdby;
        private String publisher;
        private String imageurl;
        private String bio;
        private String genero;
        private String birthday;


        public people(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio, String birthday, String genero) {
            this.name = name;
            this.realname = realname;
            this.team = team;
            this.firstappearance = firstappearance;
            this.createdby = createdby;
            this.publisher = publisher;
            this.imageurl = imageurl;
            this.bio = bio;
            this.name = genero;
            this.name = birthday;
        }

        public String getName() {
            return name;
        }

        public String getGenero() {
            return genero;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getRealname() {
            return realname;
        }

        public String getTeam() {
            return team;
        }

        public String getFirstappearance() {
            return firstappearance;
        }

        public String getCreatedby() {
            return createdby;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getImageurl() {
            return imageurl;
        }

        public String getBio() {
            return bio;
        }
    }
