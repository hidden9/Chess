package mans;

import main.Player;

public class Soldier extends Man {

    public Soldier(Player p, int index) {
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
