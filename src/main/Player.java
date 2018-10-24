package main;

import java.lang.reflect.WildcardType;

public enum Player {

    WHITE,
    BLACK;

    @Override
    public String toString() {
        return this == WHITE ? "W" : "B";
    }

    public String getDisplayName() {
        return this == WHITE ? "White Player" : "Black Player";
    }
}
