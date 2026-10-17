package model;

/** winner es null si hay empate. */
public record MatchResult(String winner, Reason reason) {

    public enum Reason { FLAG_TOUCHED, ALL_DEAD, OPPONENT_LEFT }
}
