public class P18NumberOfIslands {
    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    numIslands++;
                    findFullIsland(grid, i, j, visited);
                }
            }
        }

        return numIslands;
    }

    private static void findFullIsland(char[][] grid, int row, int col, boolean[][] visited) {
        visited[row][col] = true;

        if (row - 1 >= 0) {
            if (grid[row - 1][col] == '1' && !visited[row - 1][col]) {
                findFullIsland(grid, row - 1, col, visited);
            }
        }

        if (row + 1 < grid.length) {
            if (grid[row + 1][col] == '1' && !visited[row + 1][col]) {
                findFullIsland(grid, row + 1, col, visited);
            }
        }

        if (col - 1 >= 0) {
            if (grid[row][col - 1] == '1' && !visited[row][col - 1]) {
                findFullIsland(grid, row, col - 1, visited);
            }
        }

        if (col + 1 < grid[0].length) {
            if (grid[row][col + 1] == '1' && !visited[row][col + 1]) {
                findFullIsland(grid, row, col + 1, visited);
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = 
        {{'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        System.out.println(numIslands(grid));
    }
}
