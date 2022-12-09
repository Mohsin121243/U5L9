public class Customer
{
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n)
    {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String finalBill(double bill){
        return name + ", account number " + currAccNum + ", your bill is $" + bill;

    }

    public static int nextNum(){
        return nextAccNum;
    }
    public void updateName(String name)
    {
        this.name = name;
    }

}