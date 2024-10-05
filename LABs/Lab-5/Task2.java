import java.util.Scanner;
import java.util.Stack;



public class Task2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any equation with brackets:");
        String equation = sc.nextLine();

        System.out.println("Brackets are balanced: " + balancedBrackets(equation));
        
        sc.close();

    }

    private static boolean balancedBrackets(String equation) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<equation.length(); i++) {

            if(equation.charAt(i) == '['){
                stack.push(']');
            } else if(equation.charAt(i) == '{'){
                stack.push('}');
            } else if(equation.charAt(i) == '('){
                stack.push(')');
            } else if(equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/' || equation.charAt(i) == '%' ||
            Character.isDigit(equation.charAt(i))) {
                continue;
            } else if(equation.charAt(i) != stack.pop()){
                return false;
            }
        }

        

        return true;
    }
}
