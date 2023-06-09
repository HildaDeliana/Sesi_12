public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
                
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 10, 15 };
        int target = 8;

        
        long startTime = System.nanoTime();
        int resultIndex = binarySearch(arr, target);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        if (resultIndex != -1) {
            System.out.println("Elemen ditemukan di indeks: " + resultIndex);
        } else {
            System.out.println("Elemen tidak ditemukan.");
        }

        System.out.println("Waktu eksekusi: " + executionTime + " nanosekon");
    }
}