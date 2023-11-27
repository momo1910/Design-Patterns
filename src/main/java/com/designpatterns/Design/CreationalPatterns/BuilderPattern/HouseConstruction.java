package com.designpatterns.Design.CreationalPatterns.BuilderPattern;

public class HouseConstruction {
    public String doors;
    public String windows;
    public String rooms;
    public String guestrooms;
    public String kitchen;
    public String storerooms;
    public String terrace;
    public String floor;
    public String stairs;
    public String chimmney;
    public String balcony;



    public static class HouseConstructionBuilder {

        private String doors;
        private String windows;
        private String rooms;
        private String guestrooms;
        private String kitchen;
        private String storerooms;
        private String terrace;
        private String floor;
        private String stairs;
        private String chimmney;
        private String balcony;

        public HouseConstructionBuilder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseConstructionBuilder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseConstructionBuilder setRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseConstructionBuilder setGuestrooms(String guestrooms) {
            this.guestrooms = guestrooms;
            return this;
        }

        public HouseConstructionBuilder setKitchen(String kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public HouseConstructionBuilder setStorerooms(String storerooms) {
            this.storerooms = storerooms;
            return this;
        }

        public HouseConstructionBuilder setTerrace(String terrace) {
            this.terrace = terrace;
            return this;
        }

        public HouseConstructionBuilder setFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseConstructionBuilder setStairs(String stairs) {
            this.stairs = stairs;
            return this;
        }

        public HouseConstructionBuilder setChimmney(String chimmney) {
            this.chimmney = chimmney;
            return this;
        }

        public HouseConstructionBuilder setBalcony(String balcony) {
            this.balcony = balcony;
            return this;
        }

        public HouseConstruction build(){
            return new HouseConstruction(this);
        }

    }
    public HouseConstruction(HouseConstructionBuilder houseConstructionBuilder){
        this.doors=houseConstructionBuilder.doors;
        this.windows=houseConstructionBuilder.windows;
        this.balcony=houseConstructionBuilder.balcony;
        this.chimmney=houseConstructionBuilder.chimmney;
        this.floor=houseConstructionBuilder.floor;
        this.stairs=houseConstructionBuilder.stairs;
        this.terrace=houseConstructionBuilder.terrace;
        this.kitchen=houseConstructionBuilder.kitchen;
        this.rooms=houseConstructionBuilder.rooms;
        this.guestrooms=houseConstructionBuilder.guestrooms;
        this.storerooms=houseConstructionBuilder.storerooms;
    }

}
