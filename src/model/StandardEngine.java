package model;

/**
 * A standard engine with balanced power and fuel consumption.
 */
public class StandardEngine implements Engine {
    private final String name;
    private final double fuelConsumptionPerKm;
    private final double power;

    /**
     * Constructs a StandardEngine with predefined characteristics.
     */
    public StandardEngine() {
        this.name = "Standard Engine";
        this.fuelConsumptionPerKm = 0.10; // 0.10 liters/km fuel consumption
        this.power = 250.0; // e.g., 250 horsepower
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return name;
    }

    /** {@inheritDoc} */
    @Override
    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    /** {@inheritDoc} */
    @Override
    public double getPower() {
        return power;
    }
}
