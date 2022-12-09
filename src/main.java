// Encoding cp1251 because my Windows console show ??? for russian chars

// ��������� n-�� ������������ �����(����� ����� �� 1 �� n), n! (������������ ����� �� 1 �� n)

// �������� ��������

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� n: ");
        int n = in.nextInt();
        System.out.println("����� ����� �� 1 �� n: " + CalcSum(n));
        System.out.println("������������ ����� �� 1 �� n (n!): " + CalcFactorial(n));
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
