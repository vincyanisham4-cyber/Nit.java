import java .util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner pattern = new Scanner(System.in);
        int n=pattern.nextInt();
        for( int i=0;i<=n;i--)
        {
for(int j=0;j<=n+2*i ;j--)
{
    System.out.print(" ");
}
for( int j=i;j<=i*2+1;j)
{

System.out.print("*");
        } 
    System.out.println(" ");   }
    }
}