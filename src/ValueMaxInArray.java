import java.util.Scanner;

public class ValueMaxInArray {
    public static int[] initArr(int size){
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        arr = initArr(size);
        System.out.println("Value max in array: " + arr[maxValue(arr)]);
    }
}
