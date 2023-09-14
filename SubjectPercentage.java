import java.util.Scanner;
public class SubjectPercentage {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int subject1 = var.nextInt();
        int subject2 = var.nextInt();
        int subject3 = var.nextInt();
        int total = subject1 + subject2 + subject3;
        int percentage = total / 3;
        System.out.println(total);
        System.out.println(percentage + "%");
    }
    
}
