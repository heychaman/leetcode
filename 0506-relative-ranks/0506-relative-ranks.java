class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        int[][] athletes = new int[n][2];

    
        for (int i = 0; i < n; i++) {
            athletes[i][0] = score[i];
            athletes[i][1] = i;
        }

        
        Arrays.sort(athletes, (a, b) -> Integer.compare(b[0], a[0]));

        String[] answer = new String[n];

        
        for (int i = 0; i < n; i++) {
            int originalIndex = athletes[i][1];

            if (i == 0) {
                answer[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                answer[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(i + 1);
            }
        }

        return answer;
    }
}