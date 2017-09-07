/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author azzus
 */
public class Bankaccount {

    
    public static void main(String[] args) {
        Bankaccou acc1 = new Bankaccou("25542552",20000);
        Bankaccou acc2 = new Bankaccou("77032924",30000);
    acc1.setName("lim");
    System.out.print(acc1.getName());
    acc1.makedeposit(500);
    acc1.makedeposit(600);
    acc1.makedeposit(700);
    }
    
}
class Bankaccou{
    private static int id = 1000;
    private String accountNumber; //ID + random 2 didgit number 
    private static String routingNumber;
    private String name;
    private String SSN;
    private double balance;
    
    
    
    //Constructor 
    public Bankaccou(String SSN,double deposit){
        balance = deposit;
        System.out.println("new account created");
        this.SSN=SSN;
        id ++ ;
        setaccountNumber();
        System.out.println(id);
    }


private void setaccountNumber(){
    int random = (int) (Math.random()*100);
    System.out.println(random);
    accountNumber = id +""+random + SSN.substring(0,2);
    System.out.println("your account number"+accountNumber);
    
}


public void setName(String name){
    this.name=name;
}
public String getName(){

return name;
}

public void payBill(double amount){
   balance = balance - amount;
   
 showbalance();  
    
}

public void makedeposit(double amount){
    balance = balance + amount;
    showbalance();
}

public void showbalance(){
    System.out.println("balance" + balance);
}

}