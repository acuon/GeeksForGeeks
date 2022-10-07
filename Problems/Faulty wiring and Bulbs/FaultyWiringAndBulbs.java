//https://practice.geeksforgeeks.org/problems/faulty-wiring-and-bulbs2939/1

public class FaultyWiringAndBulbs {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 0, 1};
        int n = arr.length;
        System.out.println(flipCount(arr, n));
        arr = new int[]{0, 0, 0, 0};
        System.out.println(flipCount(arr, arr.length));
        arr = new int[]{1, 0, 0, 1};
        System.out.println(flipCount(arr, arr.length));
    }
    public static int flipCount(int[] arr, int n) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if((arr[i] + count) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
/*
    1 0 0 1 0 1 0 1
    1 1 1 0 1 0 1 0
    1 1 1 1 0 1 0 1
    1 1 1 1 1 0 1 0
    1 1 1 1 1 1 0 1
    1 1 1 1 1 1 1 0
    1 1 1 1 1 1 1 1
 */
