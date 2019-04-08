package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuPrivateMethodsTest {

	public SudokuPrivateMethodsTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void FillDiagonalRegions_Test() throws Exception {
		int[][]emptyPuzzle=new int[9][9];
		Sudoku testPuzzle = new Sudoku(emptyPuzzle);
		testPuzzle.testFillDiagonal();
		assertEquals(testPuzzle.hasDuplicates(),false);
		
		for (int i = 0; i<testPuzzle.getLatinSquare().length; i++) {
			//for (int j = 0; i<puzzle.length; j++) {
				System.out.println(Arrays.toString((testPuzzle.getRow(i))));
		}
		
		int[] region0=testPuzzle.getRegion(0);
		int[] region4=testPuzzle.getRegion(4);
		int[] region8=testPuzzle.getRegion(8);
		int[] testRegion=new int[] {1,2,3,4,5,6,7,8,9};
		
		assertEquals(testPuzzle.hasAllValues(region0,testRegion ),true);
		assertEquals(testPuzzle.hasAllValues(region4,testRegion ),true);
		assertEquals(testPuzzle.hasAllValues(region8,testRegion ),true);
		assertFalse(Arrays.equals(region0,testRegion));
		assertFalse(Arrays.equals(region4,testRegion));
		assertFalse(Arrays.equals(region8,testRegion));
		}
	
	
	@Test
	public void setRegion_Test1() throws Exception {
		int[][]emptyPuzzle=new int[9][9];
		Sudoku testPuzzle = new Sudoku(emptyPuzzle);
		int[] testRegion=new int[] {1,2,3,4,5,6,7,8,9};
		
		assertFalse(Arrays.equals(testPuzzle.getRegion(0),testRegion));
		assertFalse(Arrays.equals(testPuzzle.getRegion(3),testRegion));
		assertFalse(Arrays.equals(testPuzzle.getRegion(6),testRegion));
		
		testPuzzle.testSetRegion(0, testRegion);
		testPuzzle.testSetRegion(3, testRegion);
		testPuzzle.testSetRegion(6, testRegion);
		
		assertTrue(Arrays.equals(testPuzzle.getRegion(0),testRegion));
		assertTrue(Arrays.equals(testPuzzle.getRegion(3),testRegion));
		assertTrue(Arrays.equals(testPuzzle.getRegion(6),testRegion));
		
		
	}
	@Test
	public void setRegion_Test2() throws Exception {
		int[][]emptyPuzzle=new int[16][16];
		Sudoku testPuzzle = new Sudoku(emptyPuzzle);
		int[] testRegion=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		assertFalse(Arrays.equals(testPuzzle.getRegion(0),testRegion));
		assertFalse(Arrays.equals(testPuzzle.getRegion(5),testRegion));
		assertFalse(Arrays.equals(testPuzzle.getRegion(10),testRegion));
		
		testPuzzle.testSetRegion(0, testRegion);
		testPuzzle.testSetRegion(5, testRegion);
		testPuzzle.testSetRegion(10, testRegion);
		
		assertTrue(Arrays.equals(testPuzzle.getRegion(0),testRegion));
		assertTrue(Arrays.equals(testPuzzle.getRegion(5),testRegion));
		assertTrue(Arrays.equals(testPuzzle.getRegion(10),testRegion));
		
		
		
	}

}

