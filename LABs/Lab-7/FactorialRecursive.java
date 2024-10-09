public class FactorialRecursive {
   
        public static long factorialRecursive(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorialRecursive(n - 1);
            }
        }
    }
    

