class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int stop=0,i=0;
        for(stop=0;startFuel<target;stop++){

            while(i<stations.length&&stations[i][0]<=startFuel){
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty())
            return -1;
            startFuel+=pq.poll();
        }
        return stop;

    }
}