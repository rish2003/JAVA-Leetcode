public class Recursion {
   public int fibonacci(int n){
    if(n <= 1) return n;
    else return fibonacci(n-1) + fibonacci(n - 2);
   }

   public static void main(String[] args) {
    Recursion rec = new Recursion();
    int n = 6;
    System.out.println("Fibonacci of " + n + " is: " + rec.fibonacci(n));
   }
}
