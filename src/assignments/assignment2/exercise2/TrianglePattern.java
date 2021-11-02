package assignments.assignment2.exercise2;

public class TrianglePattern {
    // Fields
    private final int rows;
    private final int cells;
    private final int[] initRow;
    private int[][] grid;

    // Constructor
    public TrianglePattern(int n, int h, int[] init) {
        cells = n;
        rows = h;
        initRow = init;

        generateGrid();
    }

    public int getN() {
        return cells;
    }

    public int[] getInitial() {
        return initRow;
    }

    public int getH() {
        return rows;
    }

    public int getValueAt(int r, int c) {
        return grid[r][c];
    }

    public void generateGrid() {
        int[][] newGrid = new int[rows][cells];
        for (int i : getInitial()) {
            newGrid[0][i] = 1;
        }

        for (int row = 1; row < rows; row++) {
            for (int cell = 0; cell < cells; cell++) {
                if (cell - 1 >= 0 && cell + 1 < cells) {
                    // TBF This is pretty messy code but gets the job done.
                    // If all 3 cells are filled
                    if (newGrid[row - 1][cell - 1] == 1 && newGrid[row - 1][cell] == 1 && newGrid[row - 1][cell + 1] == 1) {
                        newGrid[row][cell] = 0;
                    } else {
                        // If two of the three cells are filled
                        if (newGrid[row - 1][cell] == 1 && newGrid[row - 1][cell + 1] == 1) {
                            newGrid[row][cell] = 1;
                        } else if (newGrid[row - 1][cell - 1] == 1 && newGrid[row - 1][cell + 1] == 1) {
                            newGrid[row][cell] = 0;
                        } else if (newGrid[row - 1][cell - 1] == 1 && newGrid[row - 1][cell] == 1) {
                            newGrid[row][cell] = 0;
                        } else {
                            // If only one of the three cells are filled
                            if (newGrid[row - 1][cell + 1] == 1) {
                                newGrid[row][cell] = 1;
                            } else if (newGrid[row - 1][cell] == 1) {
                                newGrid[row][cell] = 1;
                            } else if (newGrid[row - 1][cell - 1] == 1) {
                                newGrid[row][cell] = 1;
                            }
                        }
                    }
                }
            }
        }

        this.grid = newGrid;
    }

}
