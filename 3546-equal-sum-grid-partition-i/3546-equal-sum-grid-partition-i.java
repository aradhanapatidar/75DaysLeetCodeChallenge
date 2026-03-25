class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sum+=(long)grid[i][j];
            }
        }
        if(sum%2!=0) return false;
        long n=sum/2;
        sum=0;
       int i=0;
        while(i<grid.length){
       for(int j=0; j<grid[0].length; j++){
        sum+=(long)grid[i][j];
       }
       if(sum==n)  return true;
       if(sum>n)  break;
       i++;
        }
        sum=0;
        i=0;
        while(i<grid[0].length){
       for(int j=0; j<grid.length; j++){
        sum+=(long)grid[j][i];
       }
      if(sum==n)  return true;
       if(sum>n)  break;
       i++;
        }
        return false;
    }
}