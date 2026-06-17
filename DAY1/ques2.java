import java.util.Scanner;
public class ques2
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter a number");
        int n=scnr.nextInt();
        int i,j;
        int p=1;
        for(i=1;i<=10;i++)
        {
            p=n*i;
            System.out.println(n+"*"+i+"="+p);
            
        }
    }
}v
