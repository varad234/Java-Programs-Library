public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 8;
        boolean found = false;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        if (!found)
            System.out.println("Not Found");
    }
}
