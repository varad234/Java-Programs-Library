import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid; // key found
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Input the key to search
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}
