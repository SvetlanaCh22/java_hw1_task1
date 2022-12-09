// Encoding cp1251 because my Windows console show ??? for russian chars

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// Чубченко Светлана

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.println("Сумма чисел от 1 до n: " + CalcSum(n));
        System.out.println("произведение чисел от 1 до n (n!): " + CalcFactorial(n));
    }

    public static int CalcSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int CalcFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result *= i;
        }
        return result;
    }
}
