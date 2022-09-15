import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Iterator;

public class TheTasks {

	public static void main(String[] args) {
//		task1();
//		task2();
//		task3();
//		task4();
//		task5();
//		task6();
//		task2_1();
//		task2_2();
//		task2_3();
//		task2_4();
//		task2_5();
//		task2_6();
		task2_7();

	}

	public static void task1() {
		int[][][] arr1 = new int[5][5][5];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr1[i].length; k++) {
					arr1[i][j][k] = new Random().nextInt(10);
				}
			}
		}
		System.out.println(Arrays.deepToString(arr1));
		System.out.println("enter a number ");
		int n1 = new Scanner(System.in).nextInt();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr1[i].length; k++) {
					arr1[i][j][k] += n1;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr1));
	}

	public static void task2() {
		String[][] chessBoard = new String[8][8];
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				if ((i + j) % 2 == 0)
					chessBoard[i][j] = "W ";
				else
					chessBoard[i][j] = "B ";
			}
		}
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
	}

	public static void task3() {
		int[][] ints3 = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 } };
		int[][] ints32 = { { 1, 2, 3 }, { 1, 1, 1 }, { 0, 0, 0 }, { 2, 1, 0 } };
		int[][] value = new int[ints3.length][ints32[0].length];

		for (int i = 0; i < ints3.length; i++) {
			for (int j = 0; j < ints3[i].length; j++) {
				System.out.print(ints3[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < ints32.length; i++) {
			for (int j = 0; j < ints32[i].length; j++) {
				System.out.print(ints32[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int k = 0; k < ints3.length; k++) {
			for (int i = 0; i < ints3.length; i++) {
				for (int j = 0; j < ints32[i].length; j++) {
					value[k][i] += ints3[k][j] * ints32[j][i];
				}
			}
		}
		System.out.println(Arrays.deepToString(value));
	}

	public static void task4() {
		int[][] ints4 = new int[5][4];
		int sum = 0;
		for (int i = 0; i < ints4.length; i++) {
			for (int j = 0; j < ints4[i].length; j++) {
				ints4[i][j] = new Random().nextInt(10);
				sum += ints4[i][j];
			}
		}
		System.out.println(Arrays.deepToString(ints4));
		System.out.println(sum);
	}

	public static void task5() {
		int[][] ints5 = new int[5][5];
		for (int i = 0; i < ints5.length; i++) {
			for (int j = 0; j < ints5[i].length; j++) {
				ints5[i][j] = new Random().nextInt(10);
			}
		}
		for (int i = 0; i < ints5.length; i++) {
			for (int j = 0; j < ints5[i].length; j++) {
				System.out.print(ints5[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < ints5.length; i++) {
			for (int j = 0; j < ints5[i].length; j++) {
				if (i == j || i + j == ints5.length - 1)
					System.out.print(ints5[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < ints5.length; i++) {
			for (int j = 0; j < ints5[i].length; j++) {
				if (i + j == ints5.length - 1)
					System.out.print(ints5[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void task6() {
		int[][] ints6 = new int[3][7];
		for (int i = 0; i < ints6.length; i++) {
			for (int j = 0; j < ints6[i].length; j++) {
				ints6[i][j] = new Random().nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(ints6));
		for (int i = 0; i < ints6.length; i++) {
			Arrays.sort(ints6[i]);
		}
		System.out.println(Arrays.deepToString(ints6));

	}

	public static void task2_1() {
		int[][] ints7 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 } };
		int[][] extraArr = new int[ints7.length][ints7[0].length];
		for (int i = 0; i < ints7.length; i++) {
			for (int j = 0; j < ints7[i].length; j++) {
				extraArr[i][j] = ints7[i][j];
			}
		}
		for (int i = 0; i < ints7.length; i++) {
			for (int j = 0; j < ints7[i].length; j++) {
				ints7[0][j] = extraArr[1][j];
				ints7[1][j] = extraArr[0][j];
			}
		}
		System.out.println(Arrays.deepToString(ints7));
	}

	public static void task2_2() {
		int[][] ints7 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 } };
		int[][] extraArr = new int[ints7.length][ints7[0].length];
		for (int i = 0; i < ints7.length; i++) {
			for (int j = 0; j < ints7[i].length; j++) {
				extraArr[i][j] = ints7[i][j];
			}
		}
		for (int i = 0; i < ints7.length; i++) {
			for (int j = 0; j < ints7[i].length; j++) {
				ints7[i][0] = extraArr[i][ints7[0].length - 1];
				ints7[i][ints7[0].length - 1] = extraArr[i][0];
			}
		}
		System.out.println(Arrays.deepToString(ints7));
	}

	public static void task2_3() {
		int[][] ints2_3 = new int[5][5];
		for (int i = 0; i < ints2_3.length; i++) {
			for (int j = 0; j < ints2_3[i].length; j++) {
				ints2_3[i][j] = new Random().nextInt(10);
			}
		}
		for (int i = 0; i < ints2_3.length; i++) {
			for (int j = 0; j < ints2_3[i].length; j++) {
				System.out.print(ints2_3[i][j]);
			}
			System.out.println();
		}
		double maxAverageValue = Double.MIN_VALUE;
		double averageValue = Double.MIN_VALUE;
		int indexOfRow = 0;
		for (int i = 0; i < ints2_3.length; i++) {
			for (int j = 0; j < ints2_3[i].length; j++) {
				averageValue += ints2_3[i][j] / (ints2_3[i].length + 0d);
			}
			if (maxAverageValue < averageValue) {
				maxAverageValue = averageValue;
				indexOfRow = i;
			}
			averageValue = 0d;
		}
		System.out.println("index of row is " + indexOfRow + ". value is " + maxAverageValue);
	}

	public static void task2_4() {
		int[][] ints2_4 = new int[4][5];
		for (int i = 0; i < ints2_4.length; i++) {
			for (int j = 0; j < ints2_4[i].length; j++) {
				ints2_4[i][j] = new Random().nextInt(10);
			}
		}
		for (int i = 0; i < ints2_4.length; i++) {
			for (int j = 0; j < ints2_4[i].length; j++) {
				System.out.print(ints2_4[i][j]);
			}
			System.out.println();
		}
		double maxAverageValue = Double.MIN_VALUE;
		double averageValue = Double.MIN_VALUE;
		int indexOfColumn = 0;
		for (int i = 0; i < ints2_4[0].length; i++) {
			for (int j = 0; j < ints2_4.length; j++) {
				averageValue += ints2_4[j][i] / (ints2_4.length + 0d);
			}
			if (maxAverageValue < averageValue) {
				maxAverageValue = averageValue;
				indexOfColumn = i;
			}
			averageValue = 0d;
		}
		System.out.println("index of column is " + indexOfColumn + ". value is " + maxAverageValue);
	}

	public static void task2_5() {
		int[][] ints2_5 = new int[4][8];
		for (int i = 0; i < ints2_5.length; i++) {
			for (int j = 0; j < ints2_5[i].length; j++) {
				ints2_5[i][j] = new Random().nextInt(10);
			}
		}
		for (int i = 0; i < ints2_5.length; i++) {
			for (int j = 0; j < ints2_5[i].length; j++) {
				System.out.print(ints2_5[i][j]);
			}
			System.out.println();
		}
		int sumEvenNumber = 0;
		for (int i = 0; i < ints2_5.length; i++) {
			for (int j = 0; j < ints2_5[i].length; j++) {
				if (ints2_5[i][j] % 2 == 0)
					sumEvenNumber += ints2_5[i][j];
			}
		}
		System.out.println(sumEvenNumber);

	}

	public static void task2_6() {
		int[][] ints2_6 = new int[5][5];
		for (int i = 0; i < ints2_6.length; i++) {
			for (int j = 0; j < ints2_6[i].length; j++) {
				ints2_6[i][j] = new Random().nextInt(10);
			}
		}
		for (int i = 0; i < ints2_6.length; i++) {
			for (int j = 0; j < ints2_6[i].length; j++) {
				if (i == j)
					System.out.print("(" + ints2_6[i][j] + ")");
				else
					System.out.print(" " + ints2_6[i][j] + " ");
			}
			System.out.println();
		}
		int sumNumbersMainDiagonal = 0;
		for (int i = 0; i < ints2_6.length; i++) {
			for (int j = 0; j < ints2_6[i].length; j++) {
				if (i == j)
					sumNumbersMainDiagonal += ints2_6[i][j];
			}
		}
		System.out.println(sumNumbersMainDiagonal);
	}

	public static void task2_7() {
		int[][] ints2_7 = new int[7][4];
		for (int i = 0; i < ints2_7.length; i++) {
			for (int j = 0; j < ints2_7[i].length; j++) {
				ints2_7[i][j] = new Random().nextInt(30) + 10;
			}
		}
		for (int i = 0; i < ints2_7.length; i++) {
			for (int j = 0; j < ints2_7[i].length; j++) {
				System.out.print(ints2_7[i][j] + " ");
			}
			System.out.println();
		}
		int maxValue = Integer.MIN_VALUE;
		int row = 0;
		int column = 0;
		for (int i = 0; i < ints2_7.length; i++) {
			for (int j = 0; j < ints2_7[i].length; j++) {
				if (maxValue < ints2_7[i][j]) {
					maxValue = ints2_7[i][j];
					row = i;
					column = j;
				}
			}
		}
		System.out.println("row " + row + ". column " + column + ". value " + maxValue + ".");
	}

}
