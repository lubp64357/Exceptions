package blatt09;


public class SudokuSolver {
	private final static int BLOCK_SIZE = 3;

	/**
	 * Anzahl der Spalten/Zeilen
	 */
	private final static int ROW_SIZE = BLOCK_SIZE * BLOCK_SIZE;

	
	private static boolean isZeileOk(int[][]board, int zeile, int wert) {
		// TODO
		for(int i = 0; i < ROW_SIZE;i++ ) {
			if(board[zeile][i] == wert) {
				return false;
				}
		}
		return true; 
	}

	/**
	 * Pruefen, ob ein gegebener Wert in einer Spalte erlaubt ist.
	 * 
	 * @param spalte Spalte, in der der Wert geprueft wird
	 * @param wert   Wert, der noch nicht in der Spalte vorhanden sein darf
	 * @return true, falls Wert noch nicht vorhanden.
	 */
	private static boolean isSpalteOk(int[][]board, int spalte, int wert) {
		// TODO
		for(int i = 0; i < ROW_SIZE;i++ ) {
			if(board[i][spalte] == wert) {
				return false;
				} 
		}return true;
		
	}

	/**
	 * Pruefen, ob ein gegebener Wert in einem Block erlaubt ist.
	 * 
	 * @param zeile  Zeile, in der der Wert geprueft wird
	 * @param spalte Spalte, in der der Wert geprueft wird
	 * @param wert   Wert, der noch nicht in dem Block vorhanden sein darf
	 * @return true, falls Wert noch nicht vorhanden.
	 */
	private static boolean isBlockOk(int[][]board, int zeile, int spalte, int wert) {
		// TODO
		int localBlockZeile = zeile - zeile % 3;
		int localBlockSpalte = spalte - spalte % 3;
		
		for(int i = localBlockZeile; i < localBlockZeile + 3; i++) {
			for(int j = localBlockSpalte; j < localBlockSpalte + 3;  j++) {
				if(board[i][j] == wert) {
					return false;
				} 
			}
		}
		return true;
	}
	
	private static boolean isValidPlacement(int[][]board, int wert, int zeile, int spalte) {
		return isSpalteOk(board, spalte, wert) &&
				isZeileOk(board, zeile, wert) &&
				isBlockOk(board, zeile,spalte,wert);
	}
	
	private static boolean solveBoard(int board[][]) {
		// for-schleife geht ueber das ganze Spielfeld
		for(int zeile =0; zeile < ROW_SIZE; zeile++) {
			for(int spalte =0; spalte< ROW_SIZE; spalte++) {
				// sucht nach ein Platz, dass noch nicht erfüllt ist
				if(board[zeile][spalte]==0) {
					// for-schleife, dass die Zahlen 1..9 probiert
					for(int numberToTry = 1; numberToTry <=ROW_SIZE;numberToTry++) {
						// Uberpruefen, ob numberToTry geht
						// (Wenn die erste Zahl kein validPlacement ist, dann wird die naechste usw.)
						if(isValidPlacement(board, numberToTry,zeile,spalte)) {
							board[zeile][spalte]= numberToTry;
							// Bei der Rekursion wird die Methode neu aufgerufen(Findet die erste freie Platz und legt Wert darauf )
							if(solveBoard(board)) {
								return true;
							}
							else {
								// Wenn numberToTry funktioniert fuer bestimtes Platz, aber nicht fuer das ganze Spielfeld
								// Dieses Wert wird geloescht und dann geht auf die naechste Itteration der for-schleife und probiert neue Zahl
								board[zeile][spalte]=0;
							}
						}
					}
					// Wenn alle numbersToTry nicht funktionieren
					return false;
				}
			}
		}
		return true;
	}
	
	// prints the board
		private static void printBoard(int[][] board) {
			for(int zeile =0; zeile< ROW_SIZE;zeile++) {
				if(zeile%3==0&& zeile !=0) {
					System.out.println("-----------");
				}
				for(int spalte =0; spalte<ROW_SIZE; spalte++) {
					if(spalte % 3==0 && spalte !=0) {
						System.out.print("|");
					}
					System.out.print(board[zeile][spalte]);
					
				}
				System.out.println();
			}
			
		}

	/**
	 * Ein Sudoku pruefen, ob keine Werte doppelt in Zeilen, Spalten oder Bloecken
	 * auftauchen. Falls doch, einfach ausgeben, wo das der Fall ist.
	
	/**
	 * Ein Sudoku ausgeben.
	 */
	public static void main(String[] args) {
		
		int[][] board =  
				{{ 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
				 { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, 
				 { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				 { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
				 { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				 { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				 { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
				 { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				 { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
		System.out.println("Am Anfang");
		printBoard(board);
		System.out.println();
		
		if(solveBoard(board)) {
			System.out.println("Successfully solved!");
			printBoard(board);
		}
		else {
			System.out.println("Can not be solved!");
		}
		
		
		
		int[][] board1 =  
			{{ 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			 { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		if(solveBoard(board1)) {
			System.out.println("Solved successfully!");
			printBoard(board1);
		} else {
			System.out.println("cannot be solved");
		}
	}
	


}
