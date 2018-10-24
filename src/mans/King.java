package mans;

import main.Player;

public class King extends Man {

    public King(Player p) {
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
