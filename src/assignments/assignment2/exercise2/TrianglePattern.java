package assignments.assignment2.exercise2;

/**
 * @author Victor Hyltoft
 *
 */

public class TrianglePattern {
    // Fields
    private final int rows;
    private final int cells;
    private final int[] initialRow;
    private int[][] grid;

    // Constructor
    public TrianglePattern(int n, int h, int[] init) {
        this.cells = n;
        this.rows = h;
        this.initialRow = init;

        generateGrid();
    }

    public int getN() {
        return this.cells;
    }

    public int[] getInitial() {
        return this.initialRow;
    }

    public int getH() {
        return this.rows;
    }

    public int getValueAt(int r, int c) {
        return this.grid[r][c];
    }

    public void generateGrid() {
        // Define new temporary grid to store cell values.
        int[][] tmpGrid = new int[rows][cells];
        // Load initials into grid
        for (int i : getInitial()) {
            tmpGrid[0][i] = 1;
        }
        // Iterate over each row (except the top row)
        for (int row = 1; row < rows; row++) {
            // Iterate over each cell
            for (int cell = 0; cell < cells; cell++) {
                // Check if out of bounds
                if (cell - 1 >= 0 && cell + 1 < cells) {
                    // Check which of the patterns;
                    // If all 3 cells are filled
                    if (tmpGrid[row - 1][cell - 1] == 1 && tmpGrid[row - 1][cell] == 1 && tmpGrid[row - 1][cell + 1] == 1) tmpGrid[row][cell] = 0;
                    // If two of the three cells are filled
                    else if (tmpGrid[row - 1][cell] == 1 && tmpGrid[row - 1][cell + 1] == 1) tmpGrid[row][cell] = 1;
                    else if (tmpGrid[row - 1][cell - 1] == 1 && tmpGrid[row - 1][cell + 1] == 1) tmpGrid[row][cell] = 0;
                    else if (tmpGrid[row - 1][cell - 1] == 1 && tmpGrid[row - 1][cell] == 1) tmpGrid[row][cell] = 0;
                    // If only one of the three cells are filled
                    else if (tmpGrid[row - 1][cell + 1] == 1) tmpGrid[row][cell] = 1;
                    else if (tmpGrid[row - 1][cell] == 1) tmpGrid[row][cell] = 1;
                    else if (tmpGrid[row - 1][cell - 1] == 1) tmpGrid[row][cell] = 1;


                }
            }
        }

        this.grid = tmpGrid;
    }

}
