// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество в последовательности(последнее число должно равняться нулю): ");
        int num1 = scanner.nextInt();
        System.out.println("Введите числа в последовательности: ");
        int num2 = scanner.nextInt();
        int sum = 0;
        while (num2 != 0) {
            int num3 = scanner.nextInt();
            if( num2 > 0 && num3 < 0) {
                sum = sum + num2;
            }
            num2 = num3;
        }
        System.out.println(sum);
    }
}

