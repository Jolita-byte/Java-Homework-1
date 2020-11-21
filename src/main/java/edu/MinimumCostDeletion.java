package edu;

public class MinimumCostDeletion {
    public static int cost(String s, int[] costs) {

        if (s == null
                || costs == null
                || s.length() != costs.length){
            return 0;
        }

        char[] sArray = s.toCharArray();
        int costAmount = 0;
        for (int i = 0; i < sArray.length - 1; i++) {
            int lastIndex = getLastIndex(sArray, i);
            costAmount += minCostBetweenTwoIndexes(i, i + lastIndex, costs);
            i += lastIndex;
        }
        return costAmount;
    }

    private static int getLastIndex(char[] sArray, int i) {
        int nextIndex = 0;
        while (i + nextIndex != sArray.length
                && sArray[i] == sArray[i + nextIndex]) {
            nextIndex++;
        }

        //nextIndex--;
        return --nextIndex;
    }

    private static int minCostBetweenTwoIndexes(int start, int end, int[] costs) {
        int maxCost = charMaxCost(start, end, costs);
        int minCostAmount = 0;

        for (int i = start; i <= end; i++) {
            if (costs[i] != maxCost) {
                minCostAmount += costs[i];
            }
        }
        return minCostAmount;
    }

    private static int charMaxCost(int start, int end, int[] costs) {
        int charMaxCost = 0;
        for (int i = start; i <= end; i++) {
            if (costs[i] > charMaxCost) {
                charMaxCost = costs[i];
            }
        }
        return charMaxCost;
    }
}
