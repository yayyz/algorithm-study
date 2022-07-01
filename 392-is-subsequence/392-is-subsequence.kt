class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var givenString = t
        for (i in s.indices) {
            var index = givenString.indexOfFirst { it == s[i] }
            if (index < 0 || (index == givenString.length - 1) && (i != s.length -1)) return false
            givenString = givenString.substring(index + 1)
        }
        return true
    }
}