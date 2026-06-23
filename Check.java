import java .util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        char charecter=str.next().charAt(0);
        if(charecter >= 97  && charecter <= 122){
            System.out.println("lowercase");
        }
        else if(charecter <= 65 && charecter<=90){
            System.out.println("uppercase");
        }
        else{
            System.out.println("digit");
        }
        




        
    str.close();
    }
    
}
