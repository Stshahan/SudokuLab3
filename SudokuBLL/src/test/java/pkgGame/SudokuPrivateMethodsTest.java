package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuPrivateMethodsTest {

	public SudokuPrivateMethodsTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void FillDiagonalRegions() throws Exception {
		Sudoku testPuzzle = new Sudoku(9);
		
		testPuzzle.fillDiagonalRegions();
		
	}

}
