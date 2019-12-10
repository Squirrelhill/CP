/*
Write a class RecentCounter to count recent requests.
It has only one method: ping(int t), where t represents some time in milliseconds.
Return the number of pings that have been made from 3000 milliseconds ago until now.
Any ping with time in [t - 3000, t] will count, including the current ping.
It is guaranteed that every call to ping uses a strictly larger value of t than before.
Note:
Each test case will have at most 10000 calls to ping.
Each test case will call ping with strictly increasing values of t.
Each call to ping will have 1 <= t <= 10^9.
*/

//import java.util.ArrayList;
import java.util.LinkedList;

public class RecentCounter {
    //private ArrayList<Integer> queue;
    private LinkedList<Integer> queue;
    public RecentCounter() {
        //this.queue = new ArrayList<Integer>();
        this.queue = new LinkedList<Integer>();
    }

    public int ping(int t) {
        /*
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i = 0; i < this.queue.size(); i++) if (this.queue.get(i) < t - 3000) indices.add(i);
        for (int j = indices.size() - 1; j >= 0; j--) {
            int index = indices.get(j);
            this.queue.remove(index);

        }
        this.queue.add(t);
        return this.queue.size();
        */
        this.queue.add(t);
        while ( this.queue.peek() < (t - 3000)) this.queue.pollFirst();
        return queue.size();
    }

    public void output() {
        for (int i: queue) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        int num = 0;
        num = rc.ping(1);
        rc.output();
        num = rc.ping(100);
        rc.output();
        num = rc.ping(3001);
        rc.output();
        num = rc.ping(3002);
        rc.output();
    }
}
