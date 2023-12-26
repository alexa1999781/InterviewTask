import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
               String name = scanner.nextLine ();
        String givenName =  ("Вячеслав");
        if (name.equals(givenName))
        {
            System.out.println("Привет, Вячеслав");
        }
    }
}