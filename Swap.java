import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
    Scanner number=new Scanner(System.in);
    int a=number.nextInt();
    int b=number.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a="+a);
    System.out.println("b="+b);




        
    }
    
}
