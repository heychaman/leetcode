class Solution {
    public boolean checkRecord(String s) {
        if (s.chars().filter(c -> c == 'A').count() >= 2) {
            return false;
        }

        if (s.contains("LLL")) {
            return false;
        }

        return true;
    }
}