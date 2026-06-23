import java .util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner no =new Scanner(System.in);
        int number1=no.nextInt();
        int number2=no.nextInt();
        int number3=no.nextInt();
        if(number1>number2&&number1>number3 )
        {
            System.out.println("number 1 is greater");
        }
        else if (number2>number1&&number2>number3){
            System.out.println("not greater");
        }
        else{
           System.out.println("number3"+number3);
        }
        
    }
    
}
