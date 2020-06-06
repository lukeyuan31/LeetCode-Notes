package Algorithm.Medium;
import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {
    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public HitCounter() {
        queue=new LinkedList<Integer>();

    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        queue.add(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (!queue.isEmpty() && timestamp-queue.peek()>=300){
            queue.poll();
        }
        return queue.size();
    }
}
