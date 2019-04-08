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
		int[][]emptyPuzzle=new int[9][9];
		Sudoku testPuzzle = new Sudoku(emptyPuzzle);
		int[] emptyRegion=new int[] {0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < 9; i++) {
			testPuzzle.setRegion(i, emptyRegion);
		}
		testPuzzle.testFillDiagonal();
		
		assertEquals(testPuzzle.hasDuplicates(),false);
		
		int[] region0=testPuzzle.getRegion(0);
		int[] region4=testPuzzle.getRegion(4);
		int[] region8=testPuzzle.getRegion(8);
		int[] testRegion=new int[] {1,2,3,4,5,6,7,8,9};
		assertEquals(testPuzzle.hasAllValues(region0,testRegion ),true);
		assertEquals(testPuzzle.hasAllValues(region4,testRegion ),true);
		assertEquals(testPuzzle.hasAllValues(region8,testRegion ),true);
		
		
	}

}
