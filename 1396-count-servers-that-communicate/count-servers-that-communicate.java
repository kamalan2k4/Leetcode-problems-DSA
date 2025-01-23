class Solution {
    public int countServers(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                    // int sec=0;
                if(grid[i][j]==1)
                {
                    boolean sec=false;
                    for(int k=0;k<grid[0].length;k++)
                    {
                        if(grid[i][k]==1 && k!=j)
                        {
                            // c++;
                            sec=true;
                            break;
                        }
                        
                    }

                    if(sec)
                    {
                        c++;
                    }
                    else{
                    
                    for(int l=0;l<grid.length;l++)
                    {
                        if(grid[l][j]==1 && l!=i)
                        {
                        // if(sec!=0)
                        // c++;
                        sec=true;
                        break;
                        }
                    }
                
                if(sec)
                c++;
                    }
            }
            }
        }
        return c;
    }
}