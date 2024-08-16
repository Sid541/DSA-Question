class Solution {
   
    public int finalPositionOfSnake(int n, List<String> commands) {
        int [][]arr=new int[n][n];
         int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=k++;
            }
        }
        int j=0;
        int i=0;
          for (String com : commands) {
            if (com.equals("RIGHT")) {
                j++;
            } else if (com.equals("DOWN")) {
                i++;
            } else if (com.equals("LEFT")) {
                j--;
            } else if (com.equals("UP")) {
                i--;
            }
        }
        return arr[i][j];

    }
}