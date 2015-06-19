import org.junit.Test;

public class PrintTest
{
	@Test
	public void test_checkAlive {

	int[][] board = new int[5][5];
	board = board.allAlive();
	for(int i = 0; i < size; i++){
		for(int j = 0; j < size; j++){
			assertEquals(1, board[i][j]);
		}
	}
  }
}