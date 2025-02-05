public class Test {
    public class BinarySearch {
        // Binary search method
        public static boolean binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Check if target is present at mid
                if (arr[mid] == target) {
                    return true;
                }

                // If target is greater, ignore left half
                if (arr[mid] < target) {
                    left = mid + 1;
                }
                // If target is smaller, ignore right half
                else {
                    right = mid - 1;
                }
            }

            // If target is not present in the array
            return false;
        }

        public static void main(String[] args) {
            // Example sorted array
            int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

            // Checking if command line argument is provided
            if (args.length < 1) {
                System.out.println("Usage: java BinarySearch <target>");
                return;
            }

            // Parsing target number from command line argument
            int target = Integer.parseInt(args[0]);

            // Performing binary search
            boolean result = binarySearch(arr, target);

            // Displaying search result
            if (result) {
                System.out.println("Target " + target + " is present in the array.");
            } else {
                System.out.println("Target " + target + " is not present in the array.");
            }
        }
    }
}
