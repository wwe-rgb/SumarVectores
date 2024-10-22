package fes.aragon.vectores.metodosvectores;

public class OperacionVector {
    private Vector vector1;
    private Vector vector2;
    private Vector vector3;

    public OperacionVector(Vector vector1, Vector vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public OperacionVector() {
    }

    public Vector Suma(Vector vec1, Vector vec2){

        int sumax = vec1.getCordenadaX() + vec2.getCordenadaX();
        int sumay = vec1.getCordenadaY() + vec2.getCordenadaY();
        Vector aux = new Vector(sumax,sumay);
        vector3 = aux;
        return vector3;
    }

    @Override
    public String toString() {
        return "OperacionVector{" +
                "vector3=" + vector3 +
                '}';
    }
}
