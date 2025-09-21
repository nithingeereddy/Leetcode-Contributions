class TaskManager {

    public class Task{
        int userId;
        int taskId;
        int priority;
        Task(int userId,int taskId,int priority){
            this.userId=userId;
            this.taskId=taskId;
            this.priority=priority;
        }
    }
    Map<Integer,Task> idToTask;
    PriorityQueue<Task> maxHeap;
    public TaskManager(List<List<Integer>> tasks) {
        idToTask=new HashMap<>();
        maxHeap=new PriorityQueue<>((a,b) ->{
            if(a.priority!=b.priority)
            return b.priority-a.priority;
                return b.taskId-a.taskId;
        });

        for(List<Integer> task:tasks){
            Task t=new Task(task.get(0),task.get(1),task.get(2));
            idToTask.put(t.taskId,t);
            maxHeap.offer(t);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Task t=new Task(userId,taskId,priority);
        idToTask.put(t.taskId,t);
        maxHeap.offer(t);
    }
    
    public void edit(int taskId, int newPriority) {
        Task old=idToTask.get(taskId);
        Task n=new Task(old.userId,taskId,newPriority);
        idToTask.put(taskId,n);
        maxHeap.offer(n);
    }
    
    public void rmv(int taskId) {
        idToTask.remove(taskId);
    }
    
    public int execTop() {
        while(!maxHeap.isEmpty()){
         Task p=maxHeap.poll(); 
         Task valid=idToTask.get(p.taskId);
         if(valid!=null && p.priority==valid.priority && p.taskId==valid.taskId && p.userId==valid.userId){
            idToTask.remove(p.taskId);
            return p.userId;
         }
        }
        return -1;

    
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */