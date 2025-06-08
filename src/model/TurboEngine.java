package model;

/*
 * Description: Implements a high-performance, turbocharged engine
 *              with increased fuel consumption characteristics.
 */

/**
 * A turbocharged engine offering high power at the expense of higher fuel consumption.
 */
public class TurboEngine implements Engine {
    // Name identifier for this engine type
    private final String name;
    // Fuel consumption in liters per kilometer
    private final double fuelConsumptionPerKm;
    // Engine power in horsepower
    private final double power;

    /**
     * Constructs a TurboEngine with predefined characteristics.
     */
    public TurboEngine() {
        /*
         * Initialize fields:
         * - name: descriptive identifier
         * - fuelConsumptionPerKm: 0.15 L/km (higher consumption)
         * - power: 400 HP (high performance)
         */
        this.name = "Turbocharged Engine";
        this.fuelConsumptionPerKm = 0.15; // liters per km
        this.power = 400.0;                // horsepower
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        // Return the engine's display name
        return name;
    }

    /** {@inheritDoc} */
    @Override
    public double getFuelConsumptionPerKm() {
        // Return how much fuel (in L) this engine uses per km
        return fuelConsumptionPerKm;
    }

    /** {@inheritDoc} */
    @Override
    public double getPower() {
        // Return the engine's power rating in HP
        return power;
    }
}
