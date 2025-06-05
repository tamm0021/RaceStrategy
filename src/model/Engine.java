package model;

/**
 * Interface for a car's engine component with specific performance characteristics.
 */
public interface Engine {
    /**
     * Gets the name or type of the engine.
     *
     * @return the engine name (e.g., "Standard Engine").
     */
    String getName();

    /**
     * Gets the fuel consumption rate of the engine.
     *
     * @return fuel consumption in liters per kilometer.
     */
    double getFuelConsumptionPerKm();

    /**
     * Gets the engine's power output (for performance reference).
     *
     * @return engine power (e.g., horsepower or relative units).
     */
    double getPower();
}
