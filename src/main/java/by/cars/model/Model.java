package by.cars.model;

public class Model extends AbstractNamedEntity {
    private final Brand brand;

    public Model(final String name, final Brand brand) {
        super(name);
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
