import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in);

        // Ввод строки от пользователя
        System.out.println("Enter a string:");
        String inputString = scanner.next();

        // Преобразование строки в массив символов
        char[] charArray = inputString.toCharArray();

        // Вывод исходной строки
        System.out.println("Original string: " + inputString);

        // Вызов метода reverseString для инвертирования массива
        solution.reverseString(charArray);

        // Преобразование инвертированного массива обратно в строку
        String reversedString = new String(charArray);

        // Вывод инвертированной строки
        System.out.println("Reversed string: " + reversedString);
    }
}

class Solution1 {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
}

