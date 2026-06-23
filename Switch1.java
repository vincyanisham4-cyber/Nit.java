import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner  calc=new Scanner(System.in);
        int a=calc.nextInt();
    int b=calc .nextInt();
char c=calc.next().charAt(0);
switch(c)

{
case '+':
    System.out.println("addition=");
    break;
    case '-':
        System.out.println("subraction =");
        break;
        case '*':
            System.out.println("multiplication=");
            break;
            case '/':
                System.out.println("division=");
                break;
                default:
                    System.out.println("invalid input");
                    break;

    
}
    }
}
