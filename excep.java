public class excep{
    public void arith_exep(){
        try{
            int num=10;
            System.out.println("Result"+ num/0);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: Division by zero");
        }
    }

    public void aoob_exep(){
        try{
            int [] num={1,2,3,4,5};
            System.out.println("Element at 10th position: "+num[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds");
        }
    }

    public static void main(String args[]){
        excep obj=new excep();
        obj.arith_exep();
        obj.aoob_exep();
    }
}