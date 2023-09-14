import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int roll = sc.nextInt();
        String sub = sc.next();
        System.out.println("Name:" + name);
        System.out.println("Roll Number:" + roll);
        System.out.println("Field of interest:" + sub);
    }    
}



