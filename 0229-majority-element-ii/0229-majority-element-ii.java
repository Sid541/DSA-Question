class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> counts=new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        int n=nums.length;
         for (int i=0;i<n;i++) {
                counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            }
         for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value>n/3){
                list.add(key);
            }
        }
        return list;

    }
}