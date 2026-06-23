import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner conds=new Scanner(System.in);
        int number = conds.nextInt();
        if(number<0){
            System.out.println("positive number");
        }
        else if(number>0) {
            System.out.println("negative number");
        }
        else{
             System.out.println("zero");
            }
        }
    }

