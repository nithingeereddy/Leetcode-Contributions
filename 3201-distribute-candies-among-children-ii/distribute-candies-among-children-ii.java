class Solution {
   public long distributeCandies(int n, int limit) {
        long ways = 0;

        int firstPersonMinCandies = Math.max(0, n - limit - limit);
        int firstPersonMaxCandies = Math.min(limit, n);

        for (int firstPersonCandies = firstPersonMinCandies; firstPersonCandies <= firstPersonMaxCandies; firstPersonCandies++) {
            int secondPersonMinCandies = Math.max(0, n - firstPersonCandies - limit);
            int secondPersonMaxCandies = Math.min(limit, n - firstPersonCandies);
            ways += (long) (secondPersonMaxCandies - secondPersonMinCandies + 1);
        }
        return ways;   
    }
}