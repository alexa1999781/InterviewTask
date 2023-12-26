import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задан массив, длинной 4");
        int[] number = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(number));
        System.out.println("Необходимо указать данные для массива");
        System.out.println("Введите первое число:");
        number[0] = scanner.nextInt();
        System.out.println(Arrays.toString(number));
        System.out.println("Введите второе число:");
        number[1] = scanner.nextInt();
        System.out.println(Arrays.toString(number));
        System.out.println("Введите третье число:");
        number[2] = scanner.nextInt();
        System.out.println(Arrays.toString(number));
        System.out.println("Введите четвертое число:");
        number[3] = scanner.nextInt();
        System.out.println(Arrays.toString(number));
        System.out.println("Элементы массива, кратные 3-м:");
        int i;
        for (i = 0; i < number.length; i++){
            if (number[i]%3==0)
                System.out.println(number[i]);
        }

    }
}

