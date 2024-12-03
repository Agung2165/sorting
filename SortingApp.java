import java.util.Scanner;

public class SortingApp {

    // Metode Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Metode Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Temukan elemen terkecil
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Tukar elemen
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Pilih metode sorting:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        // Salin array asli untuk perbandingan
        int[] originalArr = arr.clone();

        switch (choice) {
            case 1:
                System.out.println("Array sebelum Bubble Sort:");
                displayArray(originalArr);
                bubbleSort(arr);
                System.out.println("Array setelah Bubble Sort:");
                displayArray(arr);
                break;

            case 2:
                System.out.println("Array sebelum Selection Sort:");
                displayArray(originalArr);
                selectionSort(arr);
                System.out.println("Array setelah Selection Sort:");
                displayArray(arr);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
