class Solution {
    public char repeatedCharacter(String s) {
       for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return s.charAt(j);
                }
            }
        }

        return 0;
    }
}