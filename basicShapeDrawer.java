class basicShapeDrawer {
    public static char[][] pixels = {{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'}};
    public static void main(String[] args) {
        
        DrawHorLine(1, 2, 6, '@');
        DrawVerLine(12, 2, 8, '/');
        DrawRect(3, 0, 6, 5, '$');
        
        //render to screen
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                System.out.print(pixels[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void DrawHorLine(int row, int col1, int col2, char symbol){
        for (int r = col1; r <= col2; r++){
            if (pixels[row][r] != symbol){
                pixels[row][r] = symbol;
            }
        }
    }
    public static void DrawVerLine(int col, int row1, int row2, char symbol){
        for (int r = row1; r <= row2; r++){
            if (pixels[r][col] != symbol){
                pixels[r][col] = symbol;
            }
        }
    }
    public static void DrawRect(int initrow, int initcol, int rows, int cols, char symbol){
        for (int k = initrow; k < rows; k++){
            for (int l = initcol; l < cols; l++){
                if (pixels[k][l] != symbol){
                pixels[k][l] = symbol;
                }
            }
        }
    }
}