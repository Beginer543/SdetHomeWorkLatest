package org.example.e148;
public  class E148ThisKeyword {


    static class ShoppingStore {
        private String item;
        private double price;
        private int quantity;

        public ShoppingStore(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        public double itemTotalPrice() {
            double totalValue = this.price * this.quantity;
            System.out.println(this.item + " Total Value " + totalValue);
            return totalValue;
        }
    }

        public static void main(String[] args) {
            // Creating instances of ShoppingStore and calculating totals
            ShoppingStore blanket = new ShoppingStore("Blanket", 49.99, 2);
            double blanketTotal = blanket.itemTotalPrice();

            ShoppingStore mattress = new ShoppingStore("Mattress", 219.59, 2);
            double mattressTotal = mattress.itemTotalPrice();

            double totalSum = blanketTotal + mattressTotal;
            System.out.println("You purchased " + totalSum + " Today");
        }
    }
