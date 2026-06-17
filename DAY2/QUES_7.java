import java.util.Scanner;
public class ques7
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int p=1,d;
        while(n>0)
        {
            d=n%10;
            p=p*d;
            n=n/10;
        }
        System.out.println("product of digit of entered number is = "+p);
    }
}
