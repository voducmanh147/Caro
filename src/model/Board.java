package model;

public class Board {
	// Mang luu lai cac trang thai cac quan co
		public  int[][] boardArr;
		public 	int width;
		public  int height;
		// khoi tao
		public Board(int width, int height) {
			boardArr = new int[width][height];
			this.height = height;
			this.width = width;
		}
		// reset ban co
		public void resetBoard(){
			boardArr = new int[width][height];
		}
		// Check chien thang
		public int isOver(int row, int col) {
			int r = 0, c = 0;
			int i;
			boolean play1, play2;
			// Check hang ngang
			while (c < width - 4) {
				play1 = true;
				play2 = true;
				for (i = 0; i < 5; i++) {
					if (boardArr[row][c + i] != 1)
						play1 = false;
					if (boardArr[row][c + i] != 2)
						play2 = false;
				}
				if (play1)
					return 1;
				if (play2)
					return 2;
				c++;
			}

			// Check  hang doc
			while (r < height - 4) {
				play1 = true;
				play2 = true;
				for (i = 0; i < 5; i++) {
					if (boardArr[r + i][col] != 1)
						play1 = false;
					if (boardArr[r + i][col] != 2)
						play2 = false;
				}
				if (play1)
					return 1;
				if (play2)
					return 2;
				r++;
			}

			// Check duong cheo xuong
			r = row;
			c = col;
			while (r > 0 && c > 0) {
				r--;
				c--;
			}
			while (r < height - 4 && c < width - 4) {
				play1 = true;
				play2 = true;
				for (i = 0; i < 5; i++) {
					if (boardArr[r + i][c + i] != 1)
						play1 = false;
					if (boardArr[r + i][c + i] != 2)
						play2 = false;
				}
				if (play1)
					return 1;
				if (play2)
					return 2;
				r++;
				c++;
			}

			// Check duong cheo len
			r = row;
			c = col;
			while (r < height - 1 && c > 0) {
				r++;
				c--;
			}

			while (r >= 4 && c < height - 4) {
				play1 = true;
				play2 = true;
				for (i = 0; i < 5; i++) {
					if (boardArr[r - i][c + i] != 1)
						play1 = false;
					if (boardArr[r - i][c + i] != 2)
						play2 = false;
				}
				if (play1)
					return 1;
				if (play2)
					return 2;
				r--;
				c++;
			}
			return 0;
		}
		public String toString() {
			for (int i = 0; i < boardArr.length; i++) {
				System.out.println();
				for (int j = 0; j < boardArr.length; j++) {
					System.out.print(boardArr[i][j]+" ");
				}
			}
			return "";
			
		}
		public int getPosition(int x, int y) {
			return boardArr[x][y];
		}
		public int setPosition(int x, int y, int player) {
			return boardArr[x][y] = player;
		}
}
