/**
 *  Lop danh gia trang thai cho moi o trong ban co
 */
package model;
public class EvalBoard {
	public int height, width;
	public int[][] EBoard;
	public int evaluationBoard = 0;
	public EvalBoard(int height, int width) {
		this.height = height;
		this.width = width;
		EBoard = new int[height][width];
		// ResetBoard();
	}

	public void resetBoard() {
		for (int r = 0; r < height; r++)
			for (int c = 0; c < width; c++)
				EBoard[r][c] = 0;
	}

	
	public Point MaxPos() {
		int Max = 0; // diem max 
		Point p = new Point();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (EBoard[i][j] > Max) {
					p.x = i;
					p.y = j;
					Max = EBoard[i][j];
				}
			}
		}
		if (Max == 0) {
			return null;
		}
		evaluationBoard = Max;
		return p;
	}
	public Point MinPos() {
		int Min = 10000000; // diem max 
		Point p = new Point();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (EBoard[i][j] < Min) {
					p.x = i;
					p.y = j;
					Min = EBoard[i][j];
				}
			}
		}
		if (Min == 0) {
			return null;
		}
		evaluationBoard = Min;
		return p;
	}
	
	public void pr(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public int getPosition(int x, int y) {
			return EBoard[x][y];
		}
	public void setPosition(int x, int y, int player) {
		EBoard[x][y] = player;
	}
	public static EvalBoard copy2DArray(Board input) {
		EvalBoard result = new EvalBoard(input.height, input.width);
		for (int i = 0; i < input.width; i++) {
//			System.out.println();
			for (int j = 0; j < input.height; j++) {
				result.EBoard[i][j] = input.boardArr[i][j];
//				System.out.print(result.EBoard[i][j]);
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
//
		Board ha = new Board(15, 15);
//
		ha.setPosition(5, 2, 1);
		ha.setPosition(5, 3, 1);
		ha.setPosition(5, 4, 1);

		ha.setPosition(5, 5, 2);
		ha.setPosition(6, 5, 2);
		ha.setPosition(6, 5, 1);

		System.out.println(ha.toString());
		EvalBoard e = new EvalBoard(15, 15);
		e.copy2DArray(ha);

	}
}
