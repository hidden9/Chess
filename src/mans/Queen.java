package mans;

import main.Player;

public class Queen extends Man {

    public Queen(Player p) {
        super(p, null);
    }

    @Override
    public String getDisplayLetter() {
        return null;
    }

    @Override
    public Position[] getMovablePositions() {
        return new Position[0];
    }
}
