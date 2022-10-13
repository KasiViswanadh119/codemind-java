import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double far=32+(a*9/5);
        System.out.printf("%.2f",far);
    }
}