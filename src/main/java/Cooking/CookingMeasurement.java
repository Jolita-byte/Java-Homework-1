package Cooking;

public class CookingMeasurement {
    private float amount;
    private Unit unit;

    public CookingMeasurement(float amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public float getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }
}
