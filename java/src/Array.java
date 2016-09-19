public class Array {
	int matrix1[][] = { { 2, 3, 7 }, { 7, 5, 2 }, { 5, 8, 3 } };
	int matrix2[][] = { { 7, 5, 3 }, { 9, 3, 5 }, { 4, 3, 2 } };
	int matrix[][] = new int[3][3];

	public int[][] addition() {
		for (int c = 0; c < 3; c++) {
			for (int d = 0; d < 3; d++)
				matrix[c][d] = matrix1[c][d] + matrix2[c][d];
		}
		return matrix;
	}

	public boolean display() {
		for (int c = 0; c < 3; c++) {
			System.out.print("\n");
			for (int d = 0; d < 3; d++)
				System.out.print(matrix[c][d] + "\t");
		}
		return true;
	}
}