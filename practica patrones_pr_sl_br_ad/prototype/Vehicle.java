package prototype;

public abstract class Vehicle implements Cloneable {
    public abstract void showType();

    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
