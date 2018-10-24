package mans;

import main.Player;

public abstract class Man {

    private Player owner;

    private Position position;

    public Man(Player owner, Position p) {
        position = p;
    }

    public abstract String getDisplayLetter();

    public abstract Position[] getMovablePositions();

    public Position getPosition() {
        return position;
    }

    public Player getOwner() {
        return owner;
    }
}
