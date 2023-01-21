package boardgame;

public class Pieces {
	protected Position position;
	private Boardd board;
	public Pieces(Boardd board) {
		this.board = board;
		position = null;
	}
	protected Boardd getBoard() {
		return board;
	}

	
	
}
