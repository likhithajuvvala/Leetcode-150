class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0; // unmatched '(' so far
        int add = 0;  // insertions needed for unmatched ')'

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                open++;
            } else { // ')'
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }

        return add + open;
    }
}
