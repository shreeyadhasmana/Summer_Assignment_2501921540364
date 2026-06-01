import java.util.Scanner;
public class ques1
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int i,j;
        int sum=0;
        for(i=1;i<=n;i++)
        sum=sum+i;
    }
}