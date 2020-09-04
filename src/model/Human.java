package model;

public class Human implements Player{
	Board boardState; // ban co de xu li
	int playerID = 1; // danh dau la nguoi choi

	public Human(Board board) {
		this.boardState = board;
	}
	@Override
	public Point movePoint() {
		return null;
	}
	@Override
	public int getPlayerID() {
		return playerID;
	}
	@Override
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	@Override
	public Board getBoardState() {
		return boardState;
	}

}
