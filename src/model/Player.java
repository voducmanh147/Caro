package model;

public interface Player {
	public Point movePoint(int player);

	int getPlayerID();

	void setPlayerID(int playerid);


	Board getBoardState();
}
