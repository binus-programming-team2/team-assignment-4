import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];

        System.out.println("Selamat Datang di Program Simulasi");
        int choice;
        do {
            System.out.println();
            menus();
            System.out.print("Masukkan pilihan anda : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    data = randomData(input);
                    break;
                case 2:
                    bubbleASC(data);
                    break;
                case 3:
                    selectionASC(data);
                    break;
                case 4:
                    bubbleDESC(data);
                    break;
                case 5:
                    selectionDESC(data);
                    break;
                default:
                    System.out.println("Thank you!");
                    break;
            }
        } while (choice != 6);
    }

    private static void menus() {
        System.out.println("Menu");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");
    }

    private static int[] randomData(Scanner input) {
        System.out.println();
        System.out.print("Batas Bawah : ");
        int lower = input.nextInt();
        System.out.print("Batas Atas  : ");
        int upper = input.nextInt();

        Random random = new Random();
        int[] randomData = new int[5];

        for(int i = 0; i < randomData.length; i++) {
            randomData[i] = random.nextInt(upper - lower) + lower;
        }

//        return randomData;
        return new int[]{237,84,122,260,169};
    }

    private static int[] bubbleASC(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.println("\nPass " + (i + 1));
            printArray(arr);

            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(arr);

            System.out.println("\nResult of Pass " + (i + 1));
            printArray(arr);
        }

        return arr;
    }

    private static void selectionASC(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.println("\nPass " + (i + 1));
            printArray(arr);

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            printArray(arr);

            System.out.println("\nResult of Pass " + (i + 1));
            printArray(arr);
        }
    }

    private static void bubbleDESC(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.println("\nPass " + (i + 1));
            printArray(arr);

            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(arr);

            System.out.println("\nResult of Pass " + (i + 1));
            printArray(arr);
        }
    }

    private static void selectionDESC(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.println("\nPass " + (i + 1));
            printArray(arr);

            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

            printArray(arr);

            System.out.println("\nResult of Pass " + (i + 1));
            printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}