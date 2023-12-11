/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nick
 */
public abstract class Product implements Comparable<Product> {
    private String name = "";
    private int price = 0;

        //Constructor
        public Product(){}
        public Product(String name, int price){
            this.name = name;
            this.price = price;
        }
        //Getter & Setter for nameOfBook
        public String getName (){
            return name;
        }
        public void setName(String s){
            this.name = "";
        }

        //Getter & Setter for priceOfBook
        public int getPrice (){
            return price;
        }
        public void setPrice(int i){
            this.price = i;
        }

         //Puts information of a CD into a string
        public String toString(){
            return "CD: " + "name: " + name + ", " + "price: " + price + "$" ;
        }

        //Compares the price of two products
        @Override
        public int compareTo(Product o) {
            int priceOfProduct = this.getPrice();
            int priceOfProductComparingTo = o.getPrice();
            int returnStatement =0;
            if(priceOfProduct > priceOfProductComparingTo){
                returnStatement = 1;
            } else if(priceOfProduct < priceOfProductComparingTo){
                returnStatement = -1;
            } else if(priceOfProduct == priceOfProductComparingTo){
                returnStatement = 0;
            }
            return returnStatement;
        }

        
}





