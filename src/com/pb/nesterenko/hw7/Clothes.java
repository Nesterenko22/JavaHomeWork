package com.pb.nesterenko.hw7;

public abstract class Clothes {


    public class Clothes {
        private String color;
        private int size;
        private int prise;


        public Clothes(String color, int size, int prise) {
            this.color = color;
            this.size = size;
            this.prise = prise;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getPrise() {
            return prise;
        }

        public void setPrise(int prise) {
            this.prise = prise;
        }
    }