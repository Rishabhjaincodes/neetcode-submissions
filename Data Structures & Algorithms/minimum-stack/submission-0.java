class MinStack {

    Stack<Integer> k;
    Stack<Integer> min;

    public MinStack() {
        k = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        k.push(val);

        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        if (k.peek().equals(min.peek())) {
            min.pop();
        }
        k.pop();
    }

    public int top() {
        return k.peek();
    }

    public int getMin() {
        return min.peek();
    }
}