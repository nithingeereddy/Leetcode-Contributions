class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String res = "";
        int r = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (Character.isDigit(ch)) {
                int count = 0;
                while (Character.isDigit(s.charAt(r))) {
                    count = count * 10 + (s.charAt(r) - '0');
                    r++;
                }
                countStack.push(count);
            }
            else if (ch == '[') {
                stringStack.push(res);
                res = "";
                r++;
            }
            else if (ch == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                r++;
            }
            else {
                res += ch;
                r++;
            }
        }

        return res;
    }
}
