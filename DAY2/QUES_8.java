import java.util.Scanner;
public class ques8
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int r=0,d;
        int x=n;
        while(n>0)
        {
            d=n%10;
            r+=d;
            r=r*10;
            n=n/10;
        }
        if(r==x)
        System.out.println("entered num is palindrome");
        else
        System.out.println("entered num is not palindrome");
    }
}
