/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> queueOne;
    Queue<Integer> queueTwo;
    boolean isStoreInQueueOne;

    /** Initialize your data structure here. */
    public MyStack() {
        queueOne = new LinkedList<>();
        queueTwo = new LinkedList<>();
        isStoreInQueueOne = true;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> queue = getCurrentQueue();
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> currentQueue = getCurrentQueue();
        Queue<Integer> helperQueue = getHelperQueue();
        while (currentQueue.size() > 1) {
            int i = currentQueue.remove();
            helperQueue.add(i);
        }
        int element = currentQueue.remove();
        this.changeStoreQueue();
        return element;
    }

    /** Get the top element. */
    public int top() {
        Queue<Integer> currentQueue = getCurrentQueue();
        Queue<Integer> helperQueue = getHelperQueue();
        while (currentQueue.size() > 1) {
            int i = currentQueue.remove();
            helperQueue.add(i);
        }
        int element = currentQueue.remove();
        helperQueue.add(element);
        this.changeStoreQueue();
        return element;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        Queue<Integer> queue = getCurrentQueue();
        return queue.isEmpty();
    }

    private Queue<Integer> getCurrentQueue () {
        if (isStoreInQueueOne) {
            return queueOne;
        } else {
            return queueTwo;
        }
    }

    private Queue<Integer> getHelperQueue () {
        if (isStoreInQueueOne) {
            return queueTwo;
        } else {
            return queueOne;
        }
    }

    private void changeStoreQueue () {
        isStoreInQueueOne = !isStoreInQueueOne;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

