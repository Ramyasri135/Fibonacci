import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of count: ");
        int count=sc.nextInt();
        System.out.print(a+" "+b);
        for(int i=2;i<count;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        
        }
    }
}