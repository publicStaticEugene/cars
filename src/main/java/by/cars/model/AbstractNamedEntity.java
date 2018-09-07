package by.cars.model;

public abstract class AbstractNamedEntity extends AbstractBaseEntity {
    private final String name;

    public AbstractNamedEntity(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
