// Demonstrate a very simple BankAccount class.
// November 1, 2017
class Foo
{
    /*
    Since Foo does not define any constructor, the compiler generates
    a constructor that looks like this
            public Foo(){}
    and is called the "default do-nothing constructor"
    */
    public String toString(){return "I'm just a Foo";}
}


public class BankAccount extends Object
{
    // attributes
    private String owner;
    private long id;
    private double balance;
    
    // methods
    
    // constructors ( have no return types)
    public BankAccount(){} // default do-nothing ctor
    public BankAccount(String anOwner, double aBalance, long anId)
    {
        owner = anOwner;
        balance = aBalance;
        id = anId;
    }

    public BankAccount(String anOwner,  long anId)
    {
        owner = anOwner;
        balance = 0.0;
        id = anId;
    }    
    // getter (accessor) methods
    public  String getOwner(){return owner;}
    public long getId() { return id;}
    public double getBalance(){ return balance;}
    
    // setter (mutator) methods
    public void setOwner(String anOwner) { owner = anOwner;}
    public void setBalance(double aBalance){ balance = aBalance; }
    public void setId(long anId) { id = anId;}
    
    // other useful sevices
    public void deposit(double amount) {balance += amount; }
    public void withdraw(double amount) {balance -= amount; }
    
    // define a string representaion of bank account objects
    public String toString(){ return "----------\nOwner: " + owner + 
                             "\nBalance: " + balance + "\nID: " + id + "\n----------\n";}
}
