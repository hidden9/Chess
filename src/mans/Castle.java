package mans;

import main.Player;

public class Castle extends Man {

    public Castle(Player p, int index) {
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
