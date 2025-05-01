import java.util.*;

class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        
        int left = 1, right = Math.min(tasks.length, workers.length), ans = 0;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canAssign(tasks, workers, pills, strength, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    
    private boolean canAssign(int[] tasks, int[] workers, int pills, int strength, int k) {
        Deque<Integer> candidateWorkers = new ArrayDeque<>();
        int workerPtr = workers.length - 1;
        

        for (int i = k - 1; i >= 0; i--) {

            while (workerPtr >= workers.length - k && 
                   workers[workerPtr] + strength >= tasks[i]) {
                candidateWorkers.addFirst(workers[workerPtr]);
                workerPtr--;
            }
            
            if (candidateWorkers.isEmpty()) return false;
            
            if (candidateWorkers.getLast() >= tasks[i]) {
                // Worker can complete without pill
                candidateWorkers.pollLast();
            } else {
                // Need to use pill
                if (pills == 0) return false;
                pills--;
                candidateWorkers.pollFirst();
            }
        }
        return true;
    }
}