package algo;



public class BinarySearch {
    public static int binarySearch(int key, int[] tab) {
        int low = 0;
        int high = tab.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == tab[mid]) {
                return mid;
            } else if (key < tab[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
        int key = 13; 
        int result = binarySearch(key, array);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
