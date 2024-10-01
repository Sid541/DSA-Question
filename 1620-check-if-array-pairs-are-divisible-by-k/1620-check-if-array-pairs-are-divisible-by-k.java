class Solution {
    public boolean canArrange(int[] arr, int k) {
        int map[]=new int[k];
        for(int ele: arr){
            int rem=((ele%k)+k)%k;
            map[rem]++;
        }
        if(map[0]%2!=0){
            return false;
        }
        for(int rem=1;rem<=k/2;rem++){
            int comp=k-rem;
            if(map[rem]!=map[comp]){
                return false;
            }
        }
        return true;
    }
}