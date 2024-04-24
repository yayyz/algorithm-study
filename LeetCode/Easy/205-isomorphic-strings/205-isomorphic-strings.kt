class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var map: HashMap<Char, Char> = hashMapOf()

        for (i in s.indices) {
            var sChar = s[i]
            var tChar = t[i]
            if (map.containsKey(sChar)) {
                if (map[sChar]!! == tChar)
                    continue
                else
                    return false
            } else {
                if (!map.containsValue(tChar)) {
                    map[sChar] = tChar
                } else {
                    return false
                }
            }
        }
        return true
    }
}