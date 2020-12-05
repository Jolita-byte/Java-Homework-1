package Cooking;

public enum Unit {
    ML(1, "ML"),
    TSP(5, "TSP"),
    TBSP(15, "TBSP"),
    FL_OUNCE(30, "FL_OUNCE"),
    CUP(237, "CUP"),
    PINT(474, "PINT"),
    QUART(948, "QUART"),
    GALLON(3792, "GALLON");

    private final float ml;
    private final String description;

    Unit(float ml, String description) {
        this.ml = ml;
        this.description = description.toUpperCase();
    }

    public float getMl() {
        return ml;
    }

    public String getDescription() {
        return description;
    }

    public static boolean unitExists(String unit){
        unit = unit.toUpperCase();
        for (Unit u : Unit.values()) {
            if (u.getDescription().equals(unit)){
                return true;
            }
        }
        return false;
    }


}
