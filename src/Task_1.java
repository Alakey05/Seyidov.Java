import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scan.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scan.nextInt();

        if(a > b){
            System.out.println("a > b");
        } else if(a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a : b = " + (a / b));
    }
}
