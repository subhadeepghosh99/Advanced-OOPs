import java.util.*;
class A1Q6 {
    public static void main(String args[])
    {
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),f=1;
        for (int i=1; i<=a; i++)
            f=f*i;
        System.out.println("Factorial of "+a+" is "+f+".");
    }   
}
