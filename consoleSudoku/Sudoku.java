package consoleSudoku;

public class Sudoku {



	public static boolean solveSudoku(int[][] board) {
		int[] emptyCell = findEmptyCell(board);
		if (emptyCell == null) {
			return true;
		}

		int row = emptyCell[0];
		int col = emptyCell[1];

		for (int num = 1; num <= 9; num++) {
			if (isValidMove(board, row, col, num)) {
				board[row][col] = num;

				if (solveSudoku(board)) {
					return true;
				}

				board[row][col] = 0;
			}
		}

		return false;
	}

	public static boolean isValidMove(int[][] board, int row, int col, int num) {

		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num || board[i][col] == num) {
				return false;
			}
		}

		int startRow = row - row % 3;
		int startCol = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i + startRow][j + startCol] == num) {
					return false;
				}
			}
		}

		return true;
	}

	public static int[] findEmptyCell(int[][] board) {
		int[] emptyCell = new int[2];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					emptyCell[0] = i;
					emptyCell[1] = j;
					return emptyCell;
				}
			}
		}
		return null;
	}

	public static void printBoard(int[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
				{ 6, 0, 0, 1, 9, 5, 3, 0, 0 }, 
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 },
				{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 },
				{ 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } 
				};

		System.out.println("Sudoku puzzle to solve:");
		printBoard(board);

		if (solveSudoku(board)) {
			System.out.println("\nSudoku solved:");
			printBoard(board);
		} else {
			System.out.println("\nNo solution exists.");
		}
	}
}
