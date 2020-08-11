package model;

import java.util.Arrays;

public class May implements Player {
	Board boardState; // trang thai cua ban co
	int playerid = 2; // danh dau la computer player
	int _x, _y; // toa do nuoc di

	Point goPoint = new Point();

	public May(Board board) {
		this.boardState = board;
	}

	// ham luong gia
	public int Heucristis(Board board) {
		int row, col;
		int max = 0;
		int X;
		int O;
		int[] arr = new int[board.width];
		
		int[] a = new int[5];

		// Duyet theo hang
		int rowsore = 0;
		int XSore1 = 0, OSore1 = 0;

		for (row = 0; row < board.width; row++) {
//			System.out.println();
			for (col = 0; col < board.height; col++) {
				arr[col] = board.getPosition(row, col);

			}
			for (int i = 0; i < arr.length - 4; i++) {
//				System.out.print("  ");
				for (int j = 0; j < 5; j++) {
					a[j] = arr[i + j];
//					System.out.print(a[j]);
				}
				//

				if (a[0] == 1 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 1) {
					X = 1;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//				int[] x1 = { 0, 1, 1, 1, 1 };
//				int[] x2 = { 1, 1, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 799;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//
//				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
//						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
//					X = 790;
//					if (XSore1 < X) {
//						XSore1 = X;
//					}
//				}
//				int[] x3 = { 0, 1, 1, 1, 0 };
//				int[] x4 = { 1, 1, 1, 0, 0 };
//				int[] x5 = { 0, 0, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 60;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//				int[] x6 = { 0, 1, 1, 0, 1 };
//				int[] x7 = { 1, 0, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1) {
					X = 64;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//				int[] x8 = { 0, 1, 1, 0, 0 };
//				int[] x9 = { 0, 0, 1, 1, 0 }; {0,1,1,1,2}; {2,1,1,1,0}
				if (a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					X = 4;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//				int[] x10 = { 1, 0, 1, 1, 1 };
//				int[] x11 = { 1, 1, 1, 0, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1
						|| a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 777;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
//				int[] xx = { 1, 1, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 9999;
					if (XSore1 < X) {
						XSore1 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 1 && a[4] == 2) {
					X = 1;

					if (XSore1 < X) {
						XSore1 = X;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					X = 65;

					if (XSore1 < X) {
						XSore1 = X;
					}
				}
				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
					X = 778;

					if (XSore1 < X) {
						XSore1 = X;
					}
				}

				// O
				if (a[0] == 2 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 2) {
					O = 1;
					if (OSore1 < O) {
						OSore1 = O;
					}
				}
//				int[] o1 = { 0, 2, 2, 2, 2 };
//				int[] o2 = { 2, 2, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					O = 799;
					if (OSore1 < O) {
						OSore1 = O;
					}
				}
				//
//				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2
//						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
//					O = 790;
//					if (OSore1 < O) {
//						OSore1 = O;
//					}
//				}
//				int[] o3 = { 0, 2, 2, 2, 0 };
//				int[] o4 = { 2, 2, 2, 0, 0 };
//				int[] o5 = { 0, 0, 2, 2, 2 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0) {
					O = 64;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
//				int[] o6 = { 0, 2, 2, 0, 2 };
//				int[] o7 = { 2, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 0 && a[3] == 2 && a[4] == 0) {
					O = 60;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
//				int[] o8 = { 0, 2, 2, 0, 0 };
//				int[] o9 = { 0, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 2
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1
						|| a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 0) {
					O = 4;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
//				int[] o10 = { 2, 0, 2, 2, 2 };
//				int[] o11 = { 2, 2, 2, 0, 2 };
				if (a[0] == 2 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2) {
					O = 777;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
//				int[] oo = { 2, 2, 2, 2, 2 };
				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
					O = 9999;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 2) {

					O = 2;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2) {

					O = 65;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 1
						|| a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1) {
					O = 778;

					if (OSore1 < O) {
						OSore1 = O;
					}
				}
				rowsore = OSore1 - XSore1;
			}
		}

		// Duyet theo cot
		int colsore = 0;
		int XSore2 = 0, OSore2 = 0;
		for (col = 0; col < board.width; col++) {
//			System.out.println();
			for (row = 0; row < board.height; row++) {
				arr[row] = board.getPosition(row, col);

			}
			for (int i = 0; i < arr.length - 4; i++) {
//				System.out.print("  ");
				for (int j = 0; j < 5; j++) {
					a[j] = arr[i + j];
//					System.out.print(a[j]);
				}
				//
				if (a[0] == 1 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 1) {
					X = 1;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// int[] x1 = { 0, 1, 1, 1, 1 };
				// int[] x2 = { 1, 1, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 799;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				//
//				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
//						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
//					X = 790;
//					if (XSore2 < X) {
//						XSore2 = X;
//					}
//				}

				// int[] x3 = { 0, 1, 1, 1, 0 };
				// int[] x4 = { 1, 1, 1, 0, 0 };
				// int[] x5 = { 0, 0, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 60;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// int[] x6 = { 0, 1, 1, 0, 1 };
				// int[] x7 = { 1, 0, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1) {
					X = 64;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// int[] x8 = { 0, 1, 1, 0, 0 };
				// int[] x9 = { 0, 0, 1, 1, 0 }; {0,1,1,1,2}; {2,1,1,1,0}
				if (a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					X = 4;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// int[] x10 = { 1, 0, 1, 1, 1 };
				// int[] x11 = { 1, 1, 1, 0, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1
						|| a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 777;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// int[] xx = { 1, 1, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 9999;
					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 1 && a[4] == 2) {
					X = 1;

					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {

					X = 65;

					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2) {
					X = 778;

					if (XSore2 < X) {
						XSore2 = X;
					}
				}
				// O
				if (a[0] == 2 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 2) {
					O = 1;
					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				// int[] o1 = { 0, 2, 2, 2, 2 };
				// int[] o2 = { 2, 2, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					O = 799;
					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				//
//				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2
//						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
//					O = 790;
//					if (OSore2 < O) {
//						OSore2 = O;
//					}
//				}
				// int[] o3 = { 0, 2, 2, 2, 0 };
				// int[] o4 = { 2, 2, 2, 0, 0 };
				// int[] o5 = { 0, 0, 2, 2, 2 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0) {
					O = 64;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				// int[] o6 = { 0, 2, 2, 0, 2 };
				// int[] o7 = { 2, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 0 && a[3] == 2 && a[4] == 0) {
					O = 60;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				// int[] o8 = { 0, 2, 2, 0, 0 };
				// int[] o9 = { 0, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 2
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1
						|| a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 0) {
					O = 4;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				// int[] o10 = { 2, 0, 2, 2, 2 };
				// int[] o11 = { 2, 2, 2, 0, 2 };
				if (a[0] == 2 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2) {
					O = 777;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				// int[] oo = { 2, 2, 2, 2, 2 };
				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
					O = 9999;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 2) {

					O = 2;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2) {

					O = 65;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 1
						|| a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1) {
					O = 778;

					if (OSore2 < O) {
						OSore2 = O;
					}
				}
				colsore = OSore2 - XSore2;
			}
		}

//		System.out.println("\ncheo xuong:");
		// Duyet theo duong cheo xuong
		int sorexuong = 0;
		int XSore3 = 0, OSore3 = 0;
		for (row = 0; row < board.width - 4; row++) {
//			System.out.println();
			for (col = 0; col < board.height - 4; col++) {
//				System.out.print("  ");
				for (int i = 0; i < 5; i++) {
					a[i] = board.getPosition(row + i, col + i);
//					System.out.print(a[i]);
				}

				//

				if (a[0] == 1 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 1) {
					X = 1;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// int[] x1 = { 0, 1, 1, 1, 1 };
				// int[] x2 = { 1, 1, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 799;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
//
//				if (a[0] == 1 && a[1] == 2& a[2] == 2&& a[3] == 2 && a[4] == 2
//						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1) {
//					X = 790;
//					if (XSore3 < X) {
//						XSore3 = X;
//					}
//				}
				// int[] x3 = { 0, 1, 1, 1, 0 };
				// int[] x4 = { 1, 1, 1, 0, 0 };
				// int[] x5 = { 0, 0, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 60;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// int[] x6 = { 0, 1, 1, 0, 1 };
				// int[] x7 = { 1, 0, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1) {
					X = 64;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// int[] x8 = { 0, 1, 1, 0, 0 };
				// int[] x9 = { 0, 0, 1, 1, 0 }; {0,1,1,1,2}; {2,1,1,1,0}
				if (a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					X = 4;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// int[] x10 = { 1, 0, 1, 1, 1 };
				// int[] x11 = { 1, 1, 1, 0, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1
						|| a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 777;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// int[] xx = { 1, 1, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 9999;
					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 1 && a[4] == 2) {
					X = 1;

					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {

					X = 65;

					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2) {
					X = 778;

					if (XSore3 < X) {
						XSore3 = X;
					}
				}
				// O
				if (a[0] == 2 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 2) {
					O = 1;
					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				// int[] o1 = { 0, 2, 2, 2, 2 };
				// int[] o2 = { 2, 2, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					O = 799;
					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				//
//				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2
//						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
//					O = 790;
//					if (OSore3 < O) {
//						OSore3 = O;
//					}
//				}
				// int[] o3 = { 0, 2, 2, 2, 0 };
				// int[] o4 = { 2, 2, 2, 0, 0 };
				// int[] o5 = { 0, 0, 2, 2, 2 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0) {
					O = 64;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				// int[] o6 = { 0, 2, 2, 0, 2 };
				// int[] o7 = { 2, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 0 && a[3] == 2 && a[4] == 0) {
					O = 60;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				// int[] o8 = { 0, 2, 2, 0, 0 };
				// int[] o9 = { 0, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 2
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1
						|| a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 0) {
					O = 4;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				// int[] o10 = { 2, 0, 2, 2, 2 };
				// int[] o11 = { 2, 2, 2, 0, 2 };
				if (a[0] == 2 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2) {
					O = 777;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				// int[] oo = { 2, 2, 2, 2, 2 };
				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
					O = 9999;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 2) {

					O = 2;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2) {

					O = 65;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 1
						|| a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1) {
					O = 778;

					if (OSore3 < O) {
						OSore3 = O;
					}
				}
				sorexuong = OSore3 - XSore3;
			}
		}
//		System.out.println("\ncheo len:");
		// duong cheo len
		int sorelen = 0;
		int XSore4 = 0, OSore4 = 0;
		for (row = 4; row < board.width; row++) {
//			System.out.println();
			for (col = 0; col < board.height - 4; col++) {
//				System.out.print(" ");
				for (int i = 0; i < 5; i++) {
					a[i] = boardState.getPosition(row - i, col + i);
//					System.out.print(a[i]);
				}
				//

				if (a[0] == 1 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 1) {
					X = 1;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// int[] x1 = { 0, 1, 1, 1, 1 };
				// int[] x2 = { 1, 1, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 799;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				//
//				if (a[0] == 1 && a[1] == 2 && a[2] == 2&& a[3] == 2 && a[4] == 2
//						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1) {
//					X = 790;
//					if (XSore4 < X) {
//						XSore4 = X;
//					}
//				}
				// int[] x3 = { 0, 1, 1, 1, 0 };
				// int[] x4 = { 1, 1, 1, 0, 0 };
				// int[] x5 = { 0, 0, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 60;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// int[] x6 = { 0, 1, 1, 0, 1 };
				// int[] x7 = { 1, 0, 1, 1, 0 };
				if (a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1) {
					X = 64;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// int[] x8 = { 0, 1, 1, 0, 0 };
				// int[] x9 = { 0, 0, 1, 1, 0 }; {0,1,1,1,2}; {2,1,1,1,0}
				if (a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					X = 4;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// int[] x10 = { 1, 0, 1, 1, 1 };
				// int[] x11 = { 1, 1, 1, 0, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 1
						|| a[0] == 1 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 777;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// int[] xx = { 1, 1, 1, 1, 1 };
				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 1) {
					X = 9999;
					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 1 && a[4] == 2) {
					X = 1;

					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 1
						|| a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2
						|| a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 0) {

					X = 65;

					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 1 && a[4] == 2) {
					X = 778;

					if (XSore4 < X) {
						XSore4 = X;
					}
				}
				// O
				if (a[0] == 2 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 2) {
					O = 1;
					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				// int[] o1 = { 0, 2, 2, 2, 2 };
				// int[] o2 = { 2, 2, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0) {
					O = 799;
					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				//
//				if (a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2
//						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1&& a[4] == 1) {
//					O = 790;
//					if (OSore4 < O) {
//						OSore4 = O;
//					}
//				}
				// int[] o3 = { 0, 2, 2, 2, 0 };
				// int[] o4 = { 2, 2, 2, 0, 0 };
				// int[] o5 = { 0, 0, 2, 2, 2 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0) {
					O = 64;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				// int[] o6 = { 0, 2, 2, 0, 2 };
				// int[] o7 = { 2, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 0 && a[3] == 2 && a[4] == 0) {
					O = 60;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				// int[] o8 = { 0, 2, 2, 0, 0 };
				// int[] o9 = { 0, 0, 2, 2, 0 };
				if (a[0] == 0 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 0
						|| a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 0 && a[2] == 1 && a[3] == 1 && a[4] == 2
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1
						|| a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 0) {
					O = 4;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				// int[] o10 = { 2, 0, 2, 2, 2 };
				// int[] o11 = { 2, 2, 2, 0, 2 };
				if (a[0] == 2 && a[1] == 0 && a[2] == 2 && a[3] == 2 && a[4] == 2
						|| a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 0 && a[4] == 2) {
					O = 777;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				// int[] oo = { 2, 2, 2, 2, 2 };
				if (a[0] == 2 && a[1] == 2 && a[2] == 2 && a[3] == 2 && a[4] == 2) {
					O = 9999;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 0 && a[3] == 0 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 0 && a[3] == 1 && a[4] == 2) {

					O = 2;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				if (a[0] == 2 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 0
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 1 && a[4] == 2
						|| a[0] == 0 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1
						|| a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 0) {

					O = 65;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				if (a[0] == 1 && a[1] == 2 && a[2] == 1 && a[3] == 1 && a[4] == 1
						|| a[0] == 1 && a[1] == 1 && a[2] == 1 && a[3] == 2 && a[4] == 1) {
					O = 778;

					if (OSore4 < O) {
						OSore4 = O;
					}
				}
				sorelen = OSore4 - XSore4;
			}
		}
//		System.out.println("\n" + rowsore);
//		System.out.println(colsore);
//		System.out.println(sorexuong);
//		System.out.println(sorelen);
		max = rowsore + colsore + sorexuong + sorelen;

//		System.out.print(max + " ");
		return max;

	}

	public Point maxP(int player, Board bo) {
		Point p = new Point();
		int temp = 0;

		for (int i = 0; i < bo.width; i++) {
			for (int j = 0; j < bo.height; j++) {
				if (bo.getPosition(i, j) == 0) {
					if (player == 1) {
						p.setX(i);
						p.setY(j);
						bo.setPosition(p.x, p.y, 1);
						if (Heucristis(bo) < temp) {
							temp = Heucristis(bo);
							goPoint.setX(i);
							goPoint.setY(j);
							bo.setPosition(i, j, 0);
						} else {
							bo.setPosition(i, j, 0);
						}
					}
					if (player == 2) {
						p.setX(i);
						p.setY(j);
						bo.setPosition(p.x, p.y, 2);
						if (Heucristis(bo) > temp) {
							temp = Heucristis(bo);
							goPoint.setX(i);
							goPoint.setY(j);
							bo.setPosition(i, j, 0);
						} else {
							bo.setPosition(i, j, 0);
						}
					}
				}

			}
		}
		
//		System.out.println(goPoint);
//		System.out.println(temp);
		return goPoint;
	}
	public int maxH(int player, Board bo) {
		Point p = new Point();
		int temp = 0;

		for (int i = 0; i < bo.width; i++) {
			for (int j = 0; j < bo.height; j++) {
				if (bo.getPosition(i, j) == 0) {
					if (player == 1) {
						p.setX(i);
						p.setY(j);
						bo.setPosition(p.x, p.y, 1);
						if (Heucristis(bo) < temp) {
							temp = Heucristis(bo);
							goPoint.setX(i);
							goPoint.setY(j);
							bo.setPosition(i, j, 0);
						} else {
							bo.setPosition(i, j, 0);
						}
					}
					if (player == 2) {
						p.setX(i);
						p.setY(j);
						bo.setPosition(p.x, p.y, 2);
						if (Heucristis(bo) > temp) {
							temp = Heucristis(bo);
							goPoint.setX(i);
							goPoint.setY(j);
							bo.setPosition(i, j, 0);
						} else {
							bo.setPosition(i, j, 0);
						}
					}
				}

			}
		}
		
//		System.out.println(goPoint);
//		System.out.println(temp);
		return temp;
	}

//	public int minimax(int depth, Board board, int player) {
//		int temp = 0;
//		if (depth == 0) {
//			Heucristis(board);
//		}
//		if (player == 1) {
//			temp = Integer.MAX_VALUE;
//			for (int i = 0; i < board.width; i++) {
//				for (int j = 0; j < board.height; j++) {
//					if (board.getPosition(i, j) == 0) {
//						EvalBoard ebBoard = new EvalBoard(board.height, board.width);
//						for (int k = 0; k < ebBoard.width; k++) {
//							System.out.println();
//							for (int k2 = 0; k2 < ebBoard.height; k2++) {
//								ebBoard.setPosition(k, k2, board.getPosition(i, j));
//								System.out.print(ebBoard);
//							}
//						}
//
//						ebBoard.setPosition(i, j, 1);
//						int value = minimax(depth- 1, board	, 2);
//						if (temp > value) {
//							temp = value;
//							goPoint.setX(i);
//							goPoint.setY(j);
//
//						}
//					}
//				}
//
//			}
//		}
//		if (player == 2){
//			temp = Integer.MIN_VALUE;
//			for (int i = 0; i < board.width; i++) {
//				for (int j = 0; j < board.height; j++) {
//					if (board.getPosition(i, j) == 0) {
//
//						Board ebBoard = new Board(board.height, board.width);
//						for (int k = 0; k < ebBoard.width; k++) {
//							System.out.println();
//							for (int k2 = 0; k2 < ebBoard.height; k2++) {
//								ebBoard.setPosition(k, k2, board.getPosition(i, j));
//								System.out.print(ebBoard);
//							}
//						}
//						ebBoard.setPosition(i, j, 2);
//						int value = minimax(depth - 1, ebBoard, 1);
//						if (temp < value) {
//							temp = value;
//							goPoint.setX(i);
//							goPoint.setY(j);
//
//						}
//					}
//				}
//
//			}
//		}
//
//		return temp;
//
//	}
	public int minimax(int depth, Board board, int player) {
		Point p = new Point();
		int temp = 0;
		if (depth == 0) {
			maxH(player, board);
		}else {
		if (player == 1) {
			temp = Integer.MAX_VALUE;
			p = maxP(1, board);
//			board.setPosition(p.x, p.y, 1);
			int value = minimax(depth - 1, board, 2);
			if (temp > value) {
				temp = value;
			
			}

			}
		if (player == 2){
			
			temp = Integer.MIN_VALUE;
			p = maxP(2, board);
//			board.setPosition(p.x, p.y, 2);
			int value = minimax(depth - 1, board, 1);
			if (temp < value) {
				temp = value;
			
			}

			
		}
		}
		return temp;

	}

	// tinh toan nuoc di
	public Point AI(int player) {
//		maxP(player, boardState);
		minimax(8, boardState, player);
		Point temp = goPoint;
		if (temp != null) {
			_x = temp.x;
			_y = temp.y;
		}
		return new Point(_x, _y);
	}

	@Override
	public int getPlayerID() {
		return playerid;
	}

	@Override
	public void setPlayerID(int playerid) {
		this.playerid = playerid;
	}

	@Override
	public Board getBoardState() {
		return boardState;
	}

	@Override
	public Point movePoint(int player) {
		return AI(player);
	}
//
	public static void main(String[] args) {
		
		Board ha = new Board(15, 15);
//
		ha.setPosition(5, 2, 1);
		ha.setPosition(5, 3, 1);
		ha.setPosition(5, 4, 1);

		ha.setPosition(5, 5, 2);
		ha.setPosition(6, 5, 2);
		ha.setPosition(6, 5, 1);



		System.out.println(ha.toString());
		May may = new May(ha);
		may.Heucristis(ha);
//		System.out.println(may.AI(2));
//		may.minimax(1, ha, 2);
//		System.out.println(may.minmax(2, ha));
		

	}

}
