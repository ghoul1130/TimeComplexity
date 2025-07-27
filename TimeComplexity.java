import java.util.*;

class TimeFunctions {

    public void constantTime(int n) {
        long start = System.nanoTime();
        System.out.println("Hello"); // O(1)
        long end = System.nanoTime();
        System.out.println("Constant Time - Time: " + (end - start) + " ns, Complexity: O(1)");
    }

    public void logarithmicTime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(i);
        }
        long start = System.nanoTime();
        Collections.binarySearch(list, n / 2); // O(log n)
        long end = System.nanoTime();
        System.out.println("Logarithmic Time - Time: " + (end - start) + " ns, Complexity: O(log n)");
    }

    public void linearTime(int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            System.out.print(""); // O(n)
        }
        long end = System.nanoTime();
        System.out.println("Linear Time - Time: " + (end - start) + " ns, Complexity: O(n)");
    }

    public void linearithmicTime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(n - i);
        }
        long start = System.nanoTime();
        Collections.sort(list); // O(n log n)
        long end = System.nanoTime();
        System.out.println("Linearithmic Time - Time: " + (end - start) + " ns, Complexity: O(n log n)");
    }

    public void quadraticTime(int n) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {}
        }
        long end = System.nanoTime();
        System.out.println("Quadratic Time - Time: " + (end - start) + " ns, Complexity: O(n^2)");
    }
}

public class TimeComplexity {
    public static void main(String[] args) {
        TimeFunctions tf = new TimeFunctions();

        int[] testSizes = {1, 5, 10, 15};
        for (int n : testSizes) {
            System.out.println("\n=== Input size: " + n + " ===");
            tf.constantTime(n);
            tf.logarithmicTime(n);
            tf.linearTime(n);
            tf.linearithmicTime(n);
            tf.quadraticTime(n);
        }
    }
}

---OUTPUT---

=== Input size: 1 ===
Hello
Constant Time - Time: 22400 ns, Complexity: O(1)
Logarithmic Time - Time: 15000 ns, Complexity: O(log n)
Linear Time - Time: 17500 ns, Complexity: O(n)
Linearithmic Time - Time: 148000 ns, Complexity: O(n log n)
Quadratic Time - Time: 400 ns, Complexity: O(n^2)

=== Input size: 5 ===
Hello
Constant Time - Time: 41100 ns, Complexity: O(1)
Logarithmic Time - Time: 2500 ns, Complexity: O(log n)
Linear Time - Time: 3800 ns, Complexity: O(n)
Linearithmic Time - Time: 12600 ns, Complexity: O(n log n)
Quadratic Time - Time: 600 ns, Complexity: O(n^2)

=== Input size: 10 ===
Hello
Constant Time - Time: 8500 ns, Complexity: O(1)
Logarithmic Time - Time: 2300 ns, Complexity: O(log n)
Linear Time - Time: 5100 ns, Complexity: O(n)
Linearithmic Time - Time: 3000 ns, Complexity: O(n log n)
Quadratic Time - Time: 1200 ns, Complexity: O(n^2)

=== Input size: 15 ===
Hello
Constant Time - Time: 7600 ns, Complexity: O(1)
Logarithmic Time - Time: 3000 ns, Complexity: O(log n)
Linear Time - Time: 9000 ns, Complexity: O(n)
Linearithmic Time - Time: 4800 ns, Complexity: O(n log n)
Quadratic Time - Time: 1900 ns, Complexity: O(n^2)
