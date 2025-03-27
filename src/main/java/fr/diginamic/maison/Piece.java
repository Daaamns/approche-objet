package fr.diginamic.maison;

public abstract class Piece {
    double superficie;
    int etageNb;

    public Piece(double superficie, int etageNb) {
        this.superficie = superficie;
        this.etageNb = etageNb;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("superficie : ").append(superficie);
        sb.append(", etageNb : ").append(etageNb);
        sb.append('}');
        return sb.toString();
    }
}
