package lesson1.model;

import java.io.Serializable;

/**
 * @author Sergey Klunniy
 * класс сделать ставку
 */
public class Bet implements Serializable {
    private int value;
    private double risk;

    @Override
    public String toString() {
        return "{" + value + " : " + risk + '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public Bet(int value, double risk) {
        this.value = value;
        this.risk = risk;
    }
}
