class A1Q4 {
    void factorial()
    {
        int a=10,f=1;
        for (int i=1; i<=a; i++)
            f=f*i;
        System.out.println("Factorial of "+a+" is "+f+".");
    } 

    public static void main(String args[])
    {
        A1Q4 ob=new A1Q4();
        ob.factorial();
    }
    
}
