package kata8.circlesInPolygons;

public class Polygon {

    public static void main(String[] args) {
        Polygon polygon = new Polygon(8,9);
        System.out.println(polygon.circleDiameter());
    }

    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return sideLength*(1./Math.tan(Math.toRadians(180./sides)));
    }

}

