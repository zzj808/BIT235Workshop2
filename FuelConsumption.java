public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40;
        double normalPer100km = 8;
        double roughExtraPercent = 1.15;

        // rough road fuel per 100km
        double roughPer100km = normalPer100km * roughExtraPercent;

        // distance = (total fuel / fuel per 100km) *100
        double normalDistance = (tankCapacity / normalPer100km) * 100;
        double roughDistance = (tankCapacity / roughPer100km) * 100;

        System.out.println("Distance on normal road (40L tank): " + normalDistance + " km");
        System.out.println("Distance on rough road (40L tank): " + roughDistance + " km");
    }
}