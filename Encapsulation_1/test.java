
public class test{
    public static void main(String[] args) {
        Account t=new Account();
         // t.setAcno("1112NJI65");
        // t.setBalance(999794.45);
        System.out.println("Account No: "+t.getAcno());
        System.out.println("Balance: "+t.getBalance());
        System.out.println("Balance: "+t.getAddress());

        //Parametrised Constructor Calling
        System.out.println("Parametrised calling");
        Account t1=new Account("Nitik01010101",98756421555.90,"KHURMABAD");
       
        System.out.println("Account No: "+t1.getAcno());
        System.out.println("Balance: "+t1.getBalance());
        System.out.println("Balance: "+t1.getAddress());
        

    }
}