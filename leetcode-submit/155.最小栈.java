import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    int min;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x < min) {
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        Integer x = stack.pop();
        if (x.equals(min)) {
            int newMin = Integer.MAX_VALUE;
            for (Integer i : stack) {
                if (newMin > i) {
                    newMin = i;
                }
            }
            min = newMin;
        }
    }

    public int top() {
        return stack.get(stack.size() - 1).intValue();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
// @lc code=end
