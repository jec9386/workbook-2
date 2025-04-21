package com.pluralsight;

public class CellPhone {

            private int serialNumber;
            private String model;
            private String carrier;
            private String phoneNumber;
            private String owner;

            //parameterless constructor
            public CellPhone(){
                this.serialNumber = 0;
                this.model = "";
                this.carrier = "";
                this.phoneNumber = "";
                this.owner = "";
            }

            //getters
            public int getSerialNumber() {
                return this.serialNumber;
            }
            public int getModel() {
                return this.model;
            }
            public int getCarrier() {
                return this.carrier;
            }
            public int getPhoneNumber() {
                return this.phoneNumber;
            }
            public int getOwner() {
                return this.owner;
            }

            //Setter
            public void setSerialModel(int serialNumber) {
                this.serialNumber = serialNumber;
            }
            public void setModel(String model) {
                this.model = model;
            }
            public void setCarrier(String carrier) {
                this.carrier = carrier;
            }
            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
            public void setOwner(String owner) {
                this.owner = owner;
            }


}
