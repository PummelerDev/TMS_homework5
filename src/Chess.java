
public class Chess {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				if ((i + j) % 2 == 0)
					chessBoard[i][j] = "w ";
				else
					chessBoard[i][j] = "b ";
			}
		}
		int start_i = 3;
		int start_j = 3;

		chessBoard[start_i][start_j] = "S ";

// to the up
		if (start_i - 3 >= 0 && start_j + 1 < 8)
			chessBoard[start_i - 3][start_j + 1] = "X ";
		if (start_i - 3 >= 0 && start_j - 1 < 8)
			chessBoard[start_i - 3][start_j - 1] = "X ";

// to the down
		if (start_i + 3 < 8 && start_j + 1 < 8)
			chessBoard[start_i + 3][start_j + 1] = "X ";
		if (start_i + 3 < 8 && start_j - 1 >= 0)
			chessBoard[start_i + 3][start_j - 1] = "X ";

// to the left
		if (start_i - 1 >= 0 && start_j - 3 >= 0)
			chessBoard[start_i - 1][start_j - 3] = "X ";
		if (start_i + 1 < 8 && start_j - 3 >= 0)
			chessBoard[start_i + 1][start_j - 3] = "X ";

// to the right
		if (start_i - 1 >= 0 && start_j + 3 < 8)
			chessBoard[start_i - 1][start_j + 3] = "X ";
		if (start_i + 1 < 8 && start_j + 3 < 8)
			chessBoard[start_i + 1][start_j + 3] = "X ";

		System.out.println();
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
	}

}
