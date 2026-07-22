class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> g = new ArrayList<>();
        int rk = (k%(grid.length*grid[0].length));
        int gn = 0;
        List<List<Integer>> r = new ArrayList<>();
        for (int i = 0; i<grid.length; i++){
            for(int j = 0;j<grid[0].length; j++){
                g.add(grid[i][j]);
            }
        }
        for (int i = 0; i < grid.length; i++){
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++){
                if((gn-rk)>=0){
                    l.add(g.get(gn-rk));
                }
                else{
                    l.add(g.get((grid.length*grid[0].length)+gn-rk));
                }
                gn = gn+1;
            }
            r.add(l);
        }
        return r;
    }
}