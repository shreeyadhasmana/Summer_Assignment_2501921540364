import java.util.Scanner;
public class ques3
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int i;
        int f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial ofenterd number is "+f);
    }
}