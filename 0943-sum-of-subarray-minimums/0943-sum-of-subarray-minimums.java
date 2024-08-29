class Solution {
    public int[] nse(int []arr){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? n : st.peek(); // Return index or n
            st.push(i);
        }
        return ans;
    }

    public int[] pse(int []arr){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek(); // Return index or -1
            st.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        final int mod = 1000000007;
        int n = arr.length;
        int left[] = pse(arr);
        int right[] = nse(arr);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long contribution = (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            ans = (ans + contribution) % mod;
        }
        return (int) ans;
    }
}
