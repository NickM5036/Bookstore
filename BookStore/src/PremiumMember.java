/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nick
 */
public class PremiumMember{
    
    private String name = "";
        private int spent = 0;

        //Constructor
        public PremiumMember(){}
        public PremiumMember(String name, int spent){
            this.name = name;
            this.spent = spent;
        }

        //Getter & Setter for nameOfMember
        public String getName (){
            return name;
        }
        public void setName(String s){
            this.name = "";

            }

        //Getter $ Setter for howMuchSpent 
        public int getSpent (){
            return spent;
                }
       public void setSpent(int i){
            this.spent += i;
                }

         //Puts information of a premium member into a string
        public String toString(){
            return name + " spent: " + spent + "$ at the store." ;
            }


}
