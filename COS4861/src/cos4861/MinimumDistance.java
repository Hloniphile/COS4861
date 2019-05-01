package cos4861;

import java.util.Arrays;

public class MinimumDistance {

    public static int minDistance(String firstWord, String secondWord) {
        int j = firstWord.length();
        int k = secondWord.length();
        int[][] mem = new int[j][k];
        for (int[] arr : mem) {
            Arrays.fill(arr, -1);
        }
        return calDistance(firstWord, secondWord, mem, j - 1, k - 1);
    }

    private static int calDistance(String word1, String word2, int[][] mem, int i, int j) {
        if (i < 0) {
            return j + 1;
        } else if (j < 0) {
            return i + 1;
        }

        if (mem[i][j] != -1) {
            return mem[i][j];
        }

        if (word1.charAt(i) == word2.charAt(j)) {
            mem[i][j] = calDistance(word1, word2, mem, i - 1, j - 1);
        } else {
            int prevMin = Math.min(calDistance(word1, word2, mem, i, j - 1), calDistance(word1, word2, mem, i - 1, j));
            prevMin = Math.min(prevMin, calDistance(word1, word2, mem, i - 1, j - 1));
            mem[i][j] = 1 + prevMin;
        }

        return mem[i][j];
    }
}
