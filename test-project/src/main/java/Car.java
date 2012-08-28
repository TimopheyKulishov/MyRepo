import java.io.Serializable;

/**
 * @author Timophey.Kulishov
 * @version $Rev$ <br/>
 *          $Author$ <br/>
 *          $Date$
 */
public class Car extends Super implements Serializable {

    private Color color;
    private String model;

    private static int carCount;

    public Car() {

    }

    public Car(int engine, Color color, String model) {
        super(engine);
        this.color = color;
        this.model = model;
        carCount++;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCarCount() {
        return Car.carCount;
    }

    public void method(Object o) {
        System.out.println("Object");
    }

    public void method(float f) {
        System.out.println("float");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalizing!!!!!!!!!!!!!");
//        SaveCar.car = this;
        carCount--;
    }
}
