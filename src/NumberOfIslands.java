public class NumberOfIslands {
    /*
    Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

    Example 1:

    Input:
    11110
    11010
    11000
    00000

    Output: 1
    */
    public int numIslands(char[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    total++;
                    dfs(i,j, grid);
                }
            }
        }
        return total;
    }

    public void dfs(int i, int j, char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
    }

}
