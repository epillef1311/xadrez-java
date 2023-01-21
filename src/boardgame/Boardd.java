package boardgame;

public class Boardd {
	private int rows;
	private int columns;
	private Pieces[][] pieces;
	public Boardd(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}
	
}
