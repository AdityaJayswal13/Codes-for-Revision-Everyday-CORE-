//simply put every element in priority Queue of descending order tyype and remove until k-1 and peek the kth largest.


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(Integer num:nums){
            pq.add(num);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        return pq.peek();


    }
}
