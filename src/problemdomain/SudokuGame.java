package problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
	
	private final GameState gameState;
	private final int[][] gridstate;
	
	
	public static final int GRID_BOUNDARY = 9;
	
	public SudokuGame(GameState gameState, int[][] gridstate) {
		super();
		this.gameState = gameState;
		this.gridstate = gridstate;
	}


	public GameState getGameState() {
		return gameState;
	}


	public int[][] getCCopyOfGridstate() {
		
		return SudokuUtilities.copyToNewArray(gridState);
	}
	
	
	
}
