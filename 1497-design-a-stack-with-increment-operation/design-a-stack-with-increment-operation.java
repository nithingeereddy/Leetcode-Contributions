class CustomStack {
    int[] data;
    int ptr = -1; // Tracks the top element

    public CustomStack(int maxSize) {
        data = new int[maxSize];
    }
    
    public void push(int x) {
        if (ptr < data.length - 1) {
            data[++ptr] = x; // Insert element at top
        }
    }
    
    public int pop() {
        if (ptr == -1) return -1; // Stack empty
        return data[ptr--]; // Remove top element
    }
    
    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, ptr + 1); i++) {
            data[i] += val; // Increment first k elements
        }
    }
}