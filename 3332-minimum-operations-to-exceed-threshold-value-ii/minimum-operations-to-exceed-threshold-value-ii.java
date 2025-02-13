class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int n:nums){
            pq.add(n);
        }
        while(pq.size()>=2 && pq.peek()<k){
            count++;
            int val1=pq.poll();
            
            int val2=pq.poll();
            long val3=(long)val1*2 +val2;
            
            pq.add((int) Math.min(val3,Integer.MAX_VALUE));
            
        }
        return count;
    }
}