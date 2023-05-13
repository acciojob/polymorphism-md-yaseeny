package com.driver;

public class Main {
    public static class  Product{
        private int x;
        private int y;
        private int z;
        private double a;
        private double b;

        public Product(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public Product(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Product(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Product() {
        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        Product p1 = new Product(10,15);
        Product p2 = new Product(10,15,20);
        Product p3 = new Product(2.0,3.0);
    }

}