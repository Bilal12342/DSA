
import java.util.Scanner;
public class Simplerecursion {
public static void AssenRecursion(int n){
    if (n<=0){
        return;
    }
    AssenRecursion(n-1);
 System.out.print(n+" ");
}
public static void disasernRecursion(int n){
    if (n<=0){
        return;
    }
    System.out.print(n +" ");
    disasernRecursion(n-1);
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("Aseending order");
    AssenRecursion(n);
    System.out.println(" ");
    System.out.println("Disaseending order");
    disasernRecursion(n);
  }
}

