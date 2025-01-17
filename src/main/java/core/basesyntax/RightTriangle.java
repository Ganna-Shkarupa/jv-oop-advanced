package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double scale = Math.pow(10, 2);
        double area = 0.5 * firstLeg * secondLeg;
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, " + "area: " + getArea()
                + " sq.units, first leg: " + (int)firstLeg + " units, second leg: "
                + (int)secondLeg + " units, color: " + getColor());
    }
}

