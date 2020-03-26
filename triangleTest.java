package shape;

public class triangleTest {
    public static void main(String[] args) {
        Triangle myTri = new Triangle(10,10);
        System.out.println(myTri.calculateArea());
        myTri.setBase(2);
        myTri.getBase();
        System.out.println(myTri.calculateArea(2));
    }

}
