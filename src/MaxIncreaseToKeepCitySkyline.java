public class MaxIncreaseToKeepCitySkyline {
    /*
    In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well.

    At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

    What is the maximum total sum that the height of the buildings can be increased?

    Example:
    Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
    Output: 35
    Explanation:
    The grid is:
    [ [3, 0, 8, 4],
      [2, 4, 5, 7],
      [9, 2, 6, 3],
      [0, 3, 1, 0] ]

    The skyline viewed from top or bottom is: [9, 4, 8, 7]
    The skyline viewed from left or right is: [8, 7, 9, 3]

    The grid after increasing the height of buildings without affecting skylines is:

    gridNew = [ [8, 4, 8, 7],
                [7, 4, 7, 7],
                [9, 4, 8, 7],
                [3, 3, 3, 3] ]
    */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] side = new int[grid.length];
        int[] top = new int [grid[0].length];
        int total = 0;
        int current = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {

                if (max < grid[i][j]) {
                    max = grid[i][j];
                }
                current += grid[i][j];
            }
            side[i] = max;
        }

        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (max < grid[j][i]) {
                    max = grid[j][i];
                }
            }
            top[i] = max;
        }

        for (int i = 0; i < grid[0].length; i++) {

            for (int j = 0; j < grid.length; j++) {

                grid[i][j] = Math.min(side[i], top[j]);

                total += grid[i][j];
            }

        }
        return total - current;
    }

}
