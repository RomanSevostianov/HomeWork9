
import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void findingMaxMin() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int element : arr) {
            if (element > max)
                max = element;
            else if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день " + min + " рублей");
        System.out.println("Максимальная сумма трат за день " + max + " рублей");

    }

    public static void main(String[] args) {

        int p = 0; // счетчик дней
        int amount = 0; // сумма
        int min = 0;
        int max = 0;
        int[] array = new int[30];
        int averageValue = 0;//среднее значение


        for (int i = 0; i <= array.length - 1; i++) {
            java.util.Random r = new java.util.Random();
            int x = r.nextInt(100_000) + 100_000;
            array[i] = x;
            p = p + 1;
            System.out.println("Запись в книге номер " + p + " = " + array[i] + " руб");
            amount = array[i] + amount;
            min = Arrays.stream(array).min().getAsInt();
            max = Arrays.stream(array).max().getAsInt();


        }
        averageValue = (amount / array.length - 1);
        System.out.println("\n" + "Сумма трат за месяц составила = " + amount + "  рублей");
        findingMaxMin();
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}