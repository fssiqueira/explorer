package br.com.company.explorer.domain;

/**
 * Created by Fábio Siqueira on 12/17/15.
 */
public enum CardinalDirection {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private String id;

    private CardinalDirection(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return this.id;
    }

    public static CardinalDirection getById(String id) {
        for(CardinalDirection e : values()) {
            if(e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

}
