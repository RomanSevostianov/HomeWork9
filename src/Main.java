
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


    public static void amountAndAverage() { //сумма всех чисел
        int[] arr = generateRandomArray();
        int amount = 0;
        int averageValue;
        for (int element : arr) {
            amount = element + amount;
        }
        averageValue = (amount / generateRandomArray().length - 1);
        System.out.println("Сумма всех чисел " + amount + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

    }

    public static void main(String[] args) {
        findingMaxMin();
        amountAndAverage();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}