package ss4_oop;
import java.util.Random;
public class RunStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000); // Số ngẫu nhiên từ 0 - 99999
        }
        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(arr);
        sw.stop();
        System.out.println("Thuật toán sắp xếp chon cho 100.000 số hết "+ sw.getElapsedTime() +  " milliseconds");

    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Tìm phần tử nhỏ nhất trong đoạn [i...n]
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
