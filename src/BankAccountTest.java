// Demonstares how objects of BankAccount are created and printed
// November 1, 2017
public class BankAccountTest 
{
    public static void main(String[] args)
    {
        BankAccount b3 = new BankAccount();
        BankAccount b1 = new BankAccount("Joe", 123) ;
        BankAccount b2 = new BankAccount("Jane", 400.0, 345) ;
//        System.out.println(b1.getOwner() + " " + b1.getBalance() + " " + b1.getId());
//        System.out.println(b2.getOwner() + " " + b2.getBalance() + " " + b2.getId());
        System.out.println(b1); // System.out.println(b1.toString());
        b1.deposit(125.0);
        System.out.println(b1);
        
        //System.out.println(b2); // System.out.println(b2.toString());
        
        
        
        
        
        
        
        
        
        
        int x;
        
        Foo f = new Foo();
        System.out.println(f); // the compiler actually executes System.out.println(f.toString);
    }
}
