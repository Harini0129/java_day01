class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int amt : customer) sum += amt;
            max = Math.max(max, sum);
        }
        return max;
    }
}
