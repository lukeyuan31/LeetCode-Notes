package Algorithm.Medium;
import java.util.*;

public class BasicCalculatorII {
    public int calculate(String s) {
        if (s.length() == 0) {
            return 0;
        }
        s = s.replace(" ", "");
        int result = 0;
        int num = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }

            if (!Character.isDigit(s.charAt(i)) || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(+num);
                }
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                num = 0;
                sign = s.charAt(i);
            }
        }
        for (int i : stack) {
            result = result + i;
        }

        return result;
    }
}
