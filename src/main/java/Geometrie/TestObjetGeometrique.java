package Geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

    ObjetGeometrique[] objets = new ObjetGeometrique[2];

    objets[0] = new Cercle(10);
    objets[1] = new Rectangle(5, 10);

        for (ObjetGeometrique obj : objets) {
            System.out.println("Périmètre : " + obj.perimetre());
            System.out.println("Surface : " + obj.surface());
            System.out.println("----------------------------");
        }
    }
}
