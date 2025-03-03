package sliding_window;

import java.util.*;

public class FirstNeg {
    public static ArrayList<Integer> Neg_subb(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i = 0, j = 0;

        while (j < arr.length) {
            // Add negative numbers to deque
            if (arr[j] < 0) {
                deque.add(arr[j]);
            }

            // Expand window
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Check the first negative in the window
                if (!deque.isEmpty()) {
                    result.add(deque.peek());
                } else {
                    result.add(0);
                }
                
                // Slide the window
                if (!deque.isEmpty() && deque.peek() == arr[i]) {
                    deque.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Neg_subb(arr, k));
    }
}
