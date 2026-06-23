import java .util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        int bill=sp.nextInt();
        if(bill<=100){
            System.out.println(bill*2);
        }
        else if(bill>100&&bill<=200)
        {
            System.out.println(200+(bill-100)*3);
        }
        else{
            System.out.println(500+(bill-200)*3);
        }
    }
    
}
