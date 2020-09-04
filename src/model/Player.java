package model;

public interface Player {
	public Point movePoint();

	int getPlayerID();

	void setPlayerID(int playerid);


	Board getBoardState();
}
