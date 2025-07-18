class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int x : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && st.peek() > 0 && x < 0) {
                int top = st.peek();

                if (Math.abs(top) < Math.abs(x)) {
                    st.pop(); // keep checking further
                } else if (Math.abs(top) == Math.abs(x)) {
                    st.pop(); // both explode
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // current asteroid is destroyed
                    break;
                }
            }

            if (!destroyed) {
                st.push(x);
            }
        }

        // Convert stack to int[]
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}
