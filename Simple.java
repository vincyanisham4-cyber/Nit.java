import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        int principle=sp.nextInt();
        int rate=sp.nextInt();
        int time=sp.nextInt();
        int intrest=(principal*rate*time)/100;
        System.out.println("intrest="+intrest);
        
    }
    
}
