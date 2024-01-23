class Atm{
    double am;
    public void withdraw(double amount)
    {
        double check=am-amount;
        if(check<2000){
            System.out.println("Not Enough Balance to Withdraw please maintain balance of 2000");
            System.out.println("Transaction Failed");
        }
        else{
            am-=amount;
        }
    }
    public void Deposit(double amount)
    {
        am+=amount;
        System.out.println("your Amount has been succesfully deposited");
        System.out.println("Transaction Success");
    }
    public double CheckBalance()
    {
        System.out.print("Your Current Balance:");
        return am;
    }
}
public class ATM_Interface {
    public static void main(String[] args) {
        Atm a1=new Atm();
        a1.Deposit(5000);
        a1.withdraw(4000);
        System.out.println(a1.CheckBalance());
    }
}
