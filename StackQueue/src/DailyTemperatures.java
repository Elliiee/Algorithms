import java.util.Stack;

public class DailyTemperatures {
    // keep a list of increasing temperatures
    public int[] dailyTemperatures(int[] T){
        int[] ans = new int[T.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; i--){ // loop through the daily temperatures
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) // if current temperature is large then the top stack one
                stack.pop(); // remove it from the stack
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i; // put the days in the answers
            stack.push(i);
        }
        return ans;
    }
}
