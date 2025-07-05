public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 89,67,43,21 };
        int target = 67;
        int result = orderagnosticbs(arr2, target);
        System.out.println(result);
    }

    static int orderagnosticbs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        boolean isAsc = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isAsc) {
                if (arr[mid] == target) {
                    result = mid;
                    break;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] == target) {
                    result = mid;
                    break;
                } else if (arr[mid] > target) { //only difference in < and > sign
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return result;
    }
}
