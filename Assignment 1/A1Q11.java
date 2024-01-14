import java.util.*;
class A1Q11 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Percentage:");
        int a=sc.nextInt(); char g='\0';
        if (a>=90)
            g='A';
        else if (a>=80)
            g='B';
        else if (a>=70)
            g='C';
        else if (a>=60)
            g='D';
        else if (a>=40)
            g='E';
        else if (a<40)
            g='F';
        else
            System.out.println("Wrong Input");
        System.out.println("Grade is "+g);
    }   
}