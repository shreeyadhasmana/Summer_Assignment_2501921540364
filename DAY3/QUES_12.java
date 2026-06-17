import java.util.Scanner;
public class ques12
{
    public static void main(String args[])
    {
        Scanner scnr=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=scnr.nextInt();
        System.out.println("enter 2nd number");
        int b=scnr.nextInt();
        int max=Math.max(a,b);
        int m=a*b;;
        int i;int ans=m;
        for(i=m;i>=max;i--)
        {
            if((i%a==0)&&(i%b==0))
            ans=i;
        }
        
        System.out.println("lcm = "+ans);
    }
}
