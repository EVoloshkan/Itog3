import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int number = scanner.nextInt();
        String[] lines = new String[number];
        int different = 0;
        int index = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Введите строку " + (i + 1));
            lines[i] = scanner.next();

            int count = countDifferent(lines[i]);
            if (different < count) {
                different = count;
                index = i;
            }
        }

        System.out.println("Вывод: " + lines[index]);
    }

    public static int countDifferent(String line) {
        line = line.toLowerCase();
        char[] symbols = line.toCharArray();
        int count = line.length();
        for (int i = 0; i < symbols.length; i++) {
            if (i != line.indexOf(symbols[i])) {
                count--;
            }
        }
        return count;
    }
}
