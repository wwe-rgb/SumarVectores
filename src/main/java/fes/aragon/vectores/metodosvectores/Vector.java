package fes.aragon.vectores.metodosvectores;

public class Vector {
    private int cordenadaX;
    private int cordenadaY;

    public Vector(int cordenadaX, int cordenadaY) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }

    public Vector() {
    }

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "cordenadaX=" + cordenadaX +
                ", cordenadaY=" + cordenadaY +
                '}';
    }
}
