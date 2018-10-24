package main;

import mans.Man;
import mans.Position;
import mans.Soldier;

import java.util.Stack;

public class Board {

    private static Man[][] men = new Man[8][8];

    private static Stack<Move> moves;

    public static void resetBoard() {

    }

    public static void print() {

    }

    public static Man getMan(int x, int y) {
        return men[x][y];
    }

    public static void move(Player p, Position newPosition) {

    }

    public static boolean isCheck(Player p) {
        return false;
    }

    public static boolean isCheckMate(Player p) {
        return false;
    }

    public static void popMove() {

    }


    private static class Move {

        private Man mainMan;
        private Man removedMan;
        private Position previousPosition;
        private Position newPosition;

        private Move(Man mainMan, Position previousPosition, Position newPosition, Man removedMan) {
            this.mainMan = mainMan;
            this.removedMan = removedMan;
            this.previousPosition = previousPosition;
            this.newPosition = newPosition;
        }

        public Man getMainMan() {
            return mainMan;
        }

        public Man getRemovedMan() {
            return removedMan;
        }

        public boolean hasRemovedMan() {
            return removedMan != null;
        }

        public Position getPreviousPosition() {
            return previousPosition;
        }

        public Position getNewPosition() {
            return newPosition;
        }
    }
}
