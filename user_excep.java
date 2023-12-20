class invalidage extends Exception
{
    public invalidage(String message){
        super(message);
    }
}
public class user_excep{
    public static void main(String args[]){
        int age=15;
        try{
            if(age<18 || age>60){
                throw new invalidage("Age must be between 18 and 60!!!");
            }else{
                System.out.println("Age is valid");
            }
        }
        catch(invalidage e){
            System.out.println(e.getMessage());
        }
    }
}