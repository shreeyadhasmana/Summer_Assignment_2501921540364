import java.util.Scanner;
public class ques4
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int i=1;
        while(n>0)
        {
            i++;
            n=n/10;
        }
        System.out.println("total digit of entered number are "+i);
    }
}
