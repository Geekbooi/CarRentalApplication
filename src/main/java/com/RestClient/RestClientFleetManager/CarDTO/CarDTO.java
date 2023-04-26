package com.RestClient.RestClientFleetManager.CarDTO;

public class CarDTO {
        private String brand;
        private String type;
        private String licencePlateNumber;
        private int model;
        private double Price;
        private boolean isAvailable;

        public CarDTO() {

        }

        public CarDTO(String brand, String type, String licencePlateNumber, int model, double price, boolean isAvailable) {
            this.brand = brand;
            this.type = type;
            this.licencePlateNumber = licencePlateNumber;
            this.model = model;
            Price = price;
            this.isAvailable = isAvailable;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLicencePlateNumber() {
            return licencePlateNumber;
        }

        public void setLicencePlateNumber(String vehiclePlateNumber) {
            this.licencePlateNumber = licencePlateNumber;
        }

        public int getModel() {
            return model;
        }

        public void setModel(int model) {
            this.model = model;
        }

        public double getPrice() {
            return Price;
        }

        public void setPrice(double price) {
            Price = price;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }
    }


}
