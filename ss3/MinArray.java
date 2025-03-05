import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers;
        System.out.println("Enter numbers: ");
        int SIZE = scanner.nextInt();
        numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter a size of array : ");
            numbers[i] = scanner.nextInt();
        }
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        scanner.close();
        System.out.println("Min value is : " + minValue );
    }
}
