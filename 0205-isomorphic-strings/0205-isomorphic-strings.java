class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
            //keeps track of characters from s
        int[] mapS = new int[256];
           //keeps track of characters from t
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS[a] != mapT[b]) {
                return false;
            }

             mapS[a] = i + 1;
            mapT[b] = i + 1;
        }

        return true;

    }
}