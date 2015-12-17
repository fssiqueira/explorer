package br.com.company.explorer.domain;

/**
 * Created by Fábio Siqueira on 12/17/15.
 */
public class Probe {

    Integer latitude = 0; // x line
    Integer longitude = 0; // y line

    CardinalDirection direction = CardinalDirection.NORTH;

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public CardinalDirection getDirection() {
        return direction;
    }

    public void setDirection(CardinalDirection direction) {
        this.direction = direction;
    }

    public String getPosition() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.latitude);
        sb.append(" ");
        sb.append(this.longitude);
        sb.append(" ");
        sb.append(this.direction);
        return sb.toString();
    }
}
