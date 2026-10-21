public class SphereVolume {
    public static void main(String[] args) {
        final double pi = 3.14;

        // diameters
        double sunDiameter = 865000;
        double earthDiameter = 7600;

        // radius = diameter / 2
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        // volume = (4.0/3) * pi * r^3
        double earthVolume = (4.0 / 3) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3) * pi * Math.pow(sunRadius, 3);
        double volumeRatio = sunVolume / earthVolume;

        System.out.println("Volume of Earth (cubic miles): " + earthVolume);
        System.out.println("Volume of Sun (cubic miles): " + sunVolume);
        System.out.println("Ratio Sun Volume / Earth Volume: " + volumeRatio);
    }
}