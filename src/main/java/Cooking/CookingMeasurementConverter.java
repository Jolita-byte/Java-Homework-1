package Cooking;

public class CookingMeasurementConverter {

    public static CookingMeasurement convert(CookingMeasurement originalMeasurement, Unit toUnit){
        return new CookingMeasurement(originalMeasurement.getAmount() * ratio(originalMeasurement.getUnit(),toUnit), toUnit);
    }

    private static float ratio(Unit fromUnit, Unit toUnit){
        return fromUnit.getMl()/ toUnit.getMl();
    }
}
