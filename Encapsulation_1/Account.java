public class Account{
     //Instance Variable class variable
    private String acno;
    private double balance;
    private String address;

    private void abc(){
        System.out.println("abc method called");
    }
   

    //getter
    public String getAcno(){
        return acno;
        
    }


    public double getBalance(){
        return balance;
        
    }


    public String getAddress(){
        return address;
        
    }


    //setter
    public void setAcno(String acno){
        this.acno=acno;
        
    }


    public void setBalance(double balance){
        this.balance= balance;
        
    }


    public void setAddress(String address){
        this.address=address;
        
    }


    //constructor

    //default constructor
    public Account(){
        System.out.println("DefaultConstructor Called");
    }



    //default constructor
    public Account(String acno,double balance,String address){
        this();
        this.acno=acno;
        this.address=address;
        this.balance=balance;
        abc();
        System.out.println("Parameterise Constructor Called");
    }
   
}
