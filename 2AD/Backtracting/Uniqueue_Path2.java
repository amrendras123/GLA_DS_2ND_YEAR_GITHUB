
public class Uniqueue_Path2 {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return uniquePathsRecursive(grid, m, n, 0, 0);
    }

    private int uniquePathsRecursive(int[][] grid, int m, int n, int row, int col) {
        // Base case: if the robot reaches the bottom-right corner
        if (row == m - 1 && col == n - 1) {
            return grid[row][col] == 0 ? 1 : 0; // If the bottom-right cell is not an obstacle, return 1, else return 0
        }

        // If the current cell is an obstacle, return 0 (no paths through obstacles)
        if (grid[row][col] == 1) {
            return 0;
        }

        // Recursive case: move right and move down
        int rightPaths = 0;
        int downPaths = 0;
        if (col < n - 1) {
            rightPaths = uniquePathsRecursive(grid, m, n, row, col + 1);
        }
        if (row < m - 1) {
            downPaths = uniquePathsRecursive(grid, m, n, row + 1, col);
        }

        // Return the sum of paths going right and going down
        return rightPaths + downPaths;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        Uniqueue_Path2 solution = new Uniqueue_Path2();
        System.out.println("Number of unique paths: " + solution.uniquePaths(grid));
    }
}
