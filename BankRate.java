class Bank{
    double getRateOfInterest()
    {
        return 0.0;
    }
}
class SBI extends Bank
{
    double getRateOfInterest()
    {
        return 8.0;
    }
}
class ICICI extends Bank
{
    double getRateOfInterest()
    {
        return 7.0;
    }
}
class Axis extends Bank
{
    double getRateOfInterest()
    {
        return 9.0;
    }
}
class BankRate
{
    public static void main(String args[])
    {
     SBI ob1=new SBI();
     ICICI ob2=new ICICI();
     Axis ob3=new Axis();
     System.out.println("Interest rates of different banks:\n");
     System.out.println("SBI:"+ob1.getRateOfInterest()+"\nICICI:"+ob2.getRateOfInterest()+"\nAxis:"+ob3.getRateOfInterest());
    }
}