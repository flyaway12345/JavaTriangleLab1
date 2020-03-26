package shape;

public class Triangle {
    private double height;
    private double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base =base;
        }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return ((base * height) / 2);
    }
    public double calculateArea(int x){
        return x * 10;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
