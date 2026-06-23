import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner record =new Scanner(System.in);
        String s=record.next();
        int age=record.nextInt();
        int percentage=record.nextInt();
        System.out.println("name="+s);
        System.out.println("age="+age);
        System.out.println("percentage="+percentage);
    }
}
