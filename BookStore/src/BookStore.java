/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nick
 */
import java.util.*;
import java.util.Scanner;
public class BookStore implements BookStoreSpecification {
    
    //Arrays of Inventory in the Store
    ArrayList<Book> bookShelf = new ArrayList<>();
    ArrayList<CD> cdStand = new ArrayList<>();
    ArrayList<DVD> dvdShack = new ArrayList<>();

    //Arrays of Members who joined the Store
    ArrayList<Member> members = new ArrayList<>();
     ArrayList<PremiumMember> premiumMembers = new ArrayList<>();

    //Constructor
    public BookStore(){

    }

    //Adds a book
    public void addBook(String name, int price){
        Book newBook = new Book (name, price);
        bookShelf.add(newBook);
    }

    //Adds a CD
    public void addCD(String name, int price){
        CD newCD = new CD (name, price);
        cdStand.add(newCD);
        
    }

    //Adds a DVD
    public void addDVD(String name, int price){
        DVD newDVD = new DVD (name, price);
        dvdShack.add(newDVD);
        
    }

    //Adds a member to the store
    public void addMember(String name, int spent){
        Member newMember = new Member(name, spent);
        members.add(newMember);
    }
    
    //Adds a PremiumMember to the store
    public void addPremiumMember(String name, int spent){
        PremiumMember newPremiumMember = new PremiumMember(name, spent);
        premiumMembers.add(newPremiumMember);
    }
    
    //Sell book to member
    public void sellBookToMember(String itemName, String memberName){
        for(int i = 0; i< bookShelf.size(); i++){
            if(bookShelf.get(i).getName().equals(itemName)){
                for(int j = 0; j < members.size(); j++){
                    if(members.get(j).getName().equals(memberName)){
                        members.get(j).setSpent(bookShelf.get(i).getPrice());
                        bookShelf.remove(i);
                        System.out.println(itemName + " was sold to " + memberName + ".");
                    } else 
                        System.out.println("Name of member inputed wrong not sold");
                    
                }
            }else 
                System.out.println("Name of book was inputed wrong not sold");
            
        }

    }

    //Sell book to PremiumMember
    public void sellBookToPremiumMember(String itemName2, String premiumMemberName){
        for(int i = 0; i< bookShelf.size(); i++){
            if(bookShelf.get(i).getName().equals(itemName2)){
                for(int j = 0; j < premiumMembers.size(); j++){
                    if(premiumMembers.get(j).getName().equals(premiumMemberName)){
                        premiumMembers.get(j).setSpent(bookShelf.get(i).getPrice());
                        bookShelf.remove(i);
                        System.out.println(itemName2 + " was sold to " + premiumMemberName + ".");
                    } else {
                        System.out.println("Name of member inputed wrong not sold");
                    }
                }
            }else {
                System.out.println("Name of book was inputed wrong not sold");
            }
        }

    }

    //Sell CD to member
    public void sellCdToMember(String itemName3, String memberName1){
        for(int i = 0; i< cdStand.size(); i++){
            if(cdStand.get(i).getName().equals(itemName3)){
                for(int j = 0; j < members.size(); j++){
                    if(members.get(j).getName().equals(memberName1)){
                        members.get(j).setSpent(cdStand.get(i).getPrice());
                        cdStand.remove(i);
                        System.out.println(itemName3 + " was sold to " + memberName1 + ".");
                    } else {
                        System.out.println("Name of member inputed wrong not sold");
                    }
                }
            }else {
                System.out.println("Name of book was inputed wrong not sold");
            }
        }

    }

    //Sell CD to Premium member
    public void sellCdToPremiumMember(String itemName3, String premiumMemberName1){
        for(int i = 0; i< cdStand.size(); i++){
            if(cdStand.get(i).getName().equals(itemName3)){
                for(int j = 0; j < premiumMembers.size(); j++){
                    if(premiumMembers.get(j).getName().equals(premiumMemberName1)){
                        premiumMembers.get(j).setSpent(cdStand.get(i).getPrice());
                        cdStand.remove(i);
                        System.out.println(itemName3 + " was sold to " + premiumMemberName1 + ".");
                    } else {
                        System.out.println("Name of member inputed wrong not sold");
                    }
                }
            }else {
                System.out.println("Name of book was inputed wrong not sold");
            }
        }

    }

    //Sell DVD to member
    public void sellDvdToMember(String itemName4, String memberName2){
        for(int i = 0; i< dvdShack.size(); i++){
            if(dvdShack.get(i).getName().equals(itemName4)){
                for(int j = 0; j < members.size(); j++){
                    if(members.get(j).getName().equals(memberName2)){
                        members.get(j).setSpent(dvdShack.get(i).getPrice());
                        dvdShack.remove(i);
                        System.out.println(itemName4 + " was sold to " + memberName2 + ".");
                    } else {
                        System.out.println("Name of member inputed wrong not sold");
                    }
                }
            }else {
                System.out.println("Name of DVD was inputed wrong not sold");
            }
        }

    }

    //Sell DVD to premium member
    public void sellDvdToPremiumMember(String itemName5, String premiumMemberName3){
        for(int i = 0; i< dvdShack.size(); i++){
            if(dvdShack.get(i).getName().equals(itemName5)){
                for(int j = 0; j < premiumMembers.size(); j++){
                    if(premiumMembers.get(j).getName().equals(premiumMemberName3)){
                        premiumMembers.get(j).setSpent(dvdShack.get(i).getPrice());
                        dvdShack.remove(i);
                        System.out.println(itemName5 + " was sold to " + premiumMemberName3 + ".");
                    } else {
                        System.out.println("Name of member inputed wrong not sold");
                    }
                }
            }else {
                System.out.println("Name of DVD was inputed wrong not sold");
            }
        }

    }
    
    Scanner sc = new Scanner(System. in);
    
    @Override 
    public void restockProduct(int x, int y) {
        System.out.println("What kind of item do you want to restock? \n 1. Book \n 2. CD \n 3. DVD ");
        int option = sc.nextInt();
            switch (option) {
                case 1 :
                            System.out.println("What is the name?");
                            String name = sc.next();
                            System.out.println("What is the price?");
                            int price = sc.nextInt();
                            addBook(name, price);
                            System.out.println("Book added!");
                            break;  
                case 2:
                            System.out.println("What is the name?");
                            String name1 = sc.next();
                            System.out.println("What is the price?");
                            int price1 = sc.nextInt();
                            addCD(name1, price1);
                            System.out.println("CD added!");

                            break;

                        case 3:
                            System.out.println("What is the name?");
                            String name2 = sc.next();
                            System.out.println("What is the price?");
                            int price2 = sc.nextInt();
                            addDVD(name2, price2);
                            System.out.println("DVD added!");

                            break;
                    }
                                
            }
            
            
    

    @Override
    public double inventoryValue() {
        double value = 0.00;
        if(bookShelf.isEmpty() != true){
            for (int i = 0; i < bookShelf.size(); i++) {
                value += (bookShelf.get(i).getPrice());
            }                       
        } 
        if(cdStand.isEmpty() != true){
            for (int i = 0; i < cdStand.size(); i++) {
                value += (cdStand.get(i).getPrice());
            }                       
        } 
        if(dvdShack.isEmpty() != true){
            for (int i = 0; i < dvdShack.size(); i++) {
                value += (dvdShack.get(i).getPrice());
            }                       
        } 
        return value;
    
    }
               
    
    

}





