class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
            
        }
        HashSet<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (!set.add(value)) {
                return false;
            }
        }
        return true;
    }
}