public class Volume_Of_Earth {
    public static void main(String[] args) {
        double radius = 6371.0; // Radius of the Earth in kilometers
        double volume;

        // Volume of a sphere formula: V = (4/3) * π * r^3
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of Earth in cubic kilometers is" + volume + "and cubic miles is " + (volume * 0.239913));
    }
}
