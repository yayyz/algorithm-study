class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reversedStr = "";
        // reverse the string 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return str.equals(reversedStr);
    }
}