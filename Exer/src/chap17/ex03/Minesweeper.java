package chap17.ex03;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {
	
	private static final int STATUS_VALUE = 4;
	private static final int FLAGGED = 4;
	private int[][] gameBoard;

	public List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (int[] cell : gameBoard)
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}

}
