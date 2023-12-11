/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nick
 */
import java.util.Scanner;
import java.util. *;
public class Main {

    //Main Method
    public static void main(String[] args) {

        BookStore store = new BookStore();

        Scanner sc = new Scanner(System. in);

        int options;

        do {

            //Menu options that the user inputs
            System.out.println("");
            System.out.println("Hello bookstore owner!");
            System.out.println("What would you like to do? Enter a number 0-8:");
            System.out.println("\t 0. Exit Bookstore Program");
            System.out.println("\t 1. Add a Member to the store");
            System.out.println("\t 2. Add a Premium Member to the store");
            System.out.println("\t 3. Add an item to the Inventory");
            System.out.println("\t 4. Sell an item to a member");
            System.out.println("\t 5. See members and how much they spent");
            System.out.println("\t 6. Restock an Item");
            System.out.println("\t 7. See Value of Inventory");
            System.out.println("\t 8. See Inventory");

            options = sc.nextInt();

            switch (options) {

                    //Add a member
                case 1:
                    System.out.println("What would you like your memebership name to be?");
                    String nameOfMembership = sc.next();
                    store.addMember(nameOfMembership, 0);
                    System.out.println(
                        nameOfMembership + ", added to the store!"
                    );
                    break;

                    //Add a premium member
                case 2:
                    System.out.println("What would you like your premium membership name to be?");
                    String nameOfPremiumMembership = sc.next();
                    System.out.println("What will be your payment method?: Enter credit or debit");
                    String paymentMethod = sc.next();
                    store.addPremiumMember(nameOfPremiumMembership, 30);

                    System.out.println(
                        nameOfPremiumMembership + ", added to the store as a premium member!"
                    );
                    System.out.println(
                        "30$ have been added to this membership because its premium."
                    );

                    break;

                    //Add an item to inventory Book CD or DVD
                case 3:
                    System.out.println("What would you like to add to the Inventory:");
                    System.out.println("\t 1. Add a Book");
                    System.out.println("\t 2. Add a CD");
                    System.out.println("\t 3. Add a DVD");
                    int optionOfItem = sc.nextInt();
                    switch (optionOfItem) {

                        case 1:
                            System.out.println("What is the name?");
                            String name = sc.next();
                            System.out.println("What is the price?");
                            int price = sc.nextInt();
                            store.addBook(name, price);
                            System.out.println("Book added!");

                            break;

                        case 2:
                            System.out.println("What is the name?");
                            String name1 = sc.next();
                            System.out.println("What is the price?");
                            int price1 = sc.nextInt();
                            store.addCD(name1, price1);
                            System.out.println("CD added!");

                            break;

                        case 3:
                            System.out.println("What is the name?");
                            String name2 = sc.next();
                            System.out.println("What is the price?");
                            int price2 = sc.nextInt();
                            store.addDVD(name2, price2);
                            System.out.println("DVD added!");

                            break;
                    }
                    break;

                    //Sell an item to a member
                case 4:
                    System.out.println("What would you like to sell?");
                    System.out.println("\t 1. Sell a Book");
                    System.out.println("\t 2. Sell a CD ");
                    System.out.println("\t 3. Sell a DVD");

                    int sellItem = sc.nextInt();

                    switch (sellItem) {

                        case 1:
                            if (store.bookShelf.isEmpty() == false) {

                                System.out.println("Which membership do they have?");
                                System.out.println("\t 1. Membership");
                                System.out.println("\t 2. PremiumMembership");
                                int sellBookToMembership = sc.nextInt();

                                switch (sellBookToMembership) {

                                    case 1:
                                        System.out.println("What is the book you want to sell?");
                                        String nameOfBookToSell = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell = sc.next();

                                        store.sellBookToMember(nameOfBookToSell, nameOfMembershipToSell);


                                        break;

                                    case 2:
                                        System.out.println("What is the book you want to sell?");
                                        String nameOfBookToSell2 = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell2 = sc.next();

                                        store.sellBookToPremiumMember(nameOfBookToSell2, nameOfMembershipToSell2);

                                        break;
                                }
                            } else 
                                System.out.println("There are no books in the inventory.");
                            
                            break;

                        case 2:
                            if (store.cdStand.isEmpty() == false) {
                                System.out.println("Which membership do they have?");
                                System.out.println("\t 1. Membership");
                                System.out.println("\t 2. PremiumMembership");
                                int sellCdToMembership = sc.nextInt();

                                switch (sellCdToMembership) {

                                    case 1:
                                        System.out.println("What is the CD you want to sell?");
                                        String nameOfCdToSell = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell3 = sc.next();

                                        store.sellCdToMember(nameOfCdToSell, nameOfMembershipToSell3);

                                        break;

                                    case 2:
                                        System.out.println("What is the CD you want to sell?");
                                        String nameOfCdToSell1 = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell4 = sc.next();

                                        store.sellCdToPremiumMember(nameOfCdToSell1, nameOfMembershipToSell4);

                                        break;
                                }

                            } else 
                                System.out.println("There are no CDs in the inventory.");
                            break;



                        case 3:
                            if (store.dvdShack.isEmpty()) {
                                System.out.println("Which membership do they have?");
                                System.out.println("\t 1. Membership");
                                System.out.println("\t 2. PremiumMembership");
                                int sellDvdToMembership = sc.nextInt();

                                switch (sellDvdToMembership) {

                                    case 1:
                                        System.out.println("What is the DVD you want to sell?");
                                        String nameOfDvdToSell = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell5 = sc.next();

                                        store.sellDvdToMember(nameOfDvdToSell, nameOfMembershipToSell5);

                                        break;

                                    case 2:
                                        System.out.println("What is the DVD you want to sell?");
                                        String nameOfDvdToSell1 = sc.next();
                                        System.out.println("What is the name of the membership to sell to?");
                                        String nameOfMembershipToSell6 = sc.next();

                                        store.sellDvdToPremiumMember(nameOfDvdToSell1, nameOfMembershipToSell6);

                                        break;
                                }

                            } else 
                                System.out.println("There are no DVDs in the inventory.");
                            
                            break;



                    }
                    break;


                    //Shows the members and how much they spent
                case 5:
                    System.out.println(
                        "Would you like to see the regular members or premium members?"
                    );
                    System.out.println("\t 1. Regular Members");
                    System.out.println("\t 2. Premium Members");

                    int optionOfMembership = sc.nextInt();
                    switch (optionOfMembership) {

                        case 1:

                            if (store.members.isEmpty()) {
                                System.out.println("There are no regular members.");
                            } else {
                                for (int i = 0; i < store.members.size(); i++) {
                                    System.out.println(store.members.get(i).toString());
                                }
                            }

                            break;


                        case 2:

                            if (store.premiumMembers.isEmpty()) {
                                System.out.println("There are no premium members.");
                            } else {
                                for (int i = 0; i < store.premiumMembers.size(); i++) {
                                    System.out.println(store.premiumMembers.get(i).toString());
                                }
                            }

                            break;

                    }

                    break;
                
                //Restock an Item
                case 6:
                store.restockProduct(options, options);
                    
                    break;
                
                //See the value of the whole inventory
                case 7:
                    System.out.println("The value of the whole inventory is: " + store.inventoryValue());
                    break;
                    
                    //See items in inventory
                case 8:
                    System.out.println("What would you like to see in the Inventory:");
                    System.out.println("\t 1. Books");
                    System.out.println("\t 2. CDs");
                    System.out.println("\t 3. DVDs");
                    int optionOfInventory = sc.nextInt();
                    switch (optionOfInventory) {

                        case 1:

                            if (store.bookShelf.isEmpty()) {
                                System.out.println("There are no books in the inventory");
                            } else {
                                for (int i = 0; i < store.bookShelf.size(); i++) {
                                    System.out.println(store.bookShelf.get(i).toString());
                                }
                            }

                            break;

                        case 2:

                            if (store.cdStand.isEmpty()) {
                                System.out.println("There are no CDs in the inventory");
                            } else {
                                for (int i = 0; i < store.cdStand.size(); i++) {
                                    System.out.println(store.cdStand.get(i).toString());
                                }
                            }

                            break;

                        case 3:

                            if (store.dvdShack.isEmpty()) {
                                System.out.println("There are no DVDs in the inventory");
                            } else {
                                for (int i = 0; i < store.dvdShack.size(); i++) {
                                    System.out.println(store.dvdShack.get(i).toString());
                                }
                            }

                            break;
                    }
                    break;




            }

        } while (options >= 1 && options <= 8);

    }

}





