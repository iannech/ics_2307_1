package model;

/**
 * Created by M on 1/18/2016.
 * <p>
 * A dice class method to hold our dice properties
 */
public class Dice {
    private int face;

    public Dice(int face) throws IllegalStateException {
        setFace(face);
    }

    public int getFace() {
        return face;
    }

    private void setFace(int face) {
        this.face = face;
    }
}
