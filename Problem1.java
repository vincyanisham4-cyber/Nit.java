import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner pattern=new Scanner(System.in);
        int a= pattern.nextInt();
        for (int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        
         System.out.println();
        }
          
    }   
}
