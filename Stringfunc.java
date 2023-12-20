import java.util.*;
class Stringfunc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,rev="";
        char ch;
        System.out.println("Enter a string");
        str=in.nextLine();
        System.out.println("Length of the string:"+str.length());
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("\nReverse of the string:"+rev);
        System.out.println("Enter another string:");
        str1=in.nextLine();
        if(str.equals(str1))
        System.out.println("Both the strings are same");
        else
        System.out.println(str.concat(str1));
    }
}