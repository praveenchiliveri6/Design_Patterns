import com.pattern.builder.innerclass.Vehicle;

public class BuilderClient {
    public static void main(String[] args) {

        /*
        The only difference with the outer and inner class builder is that the constructor of the main class
        can be private when we use the static inner class builder
         */

        System.out.println("Calling Inner Builder Class");
        //Using Inner Builder Class
        Vehicle car = new Vehicle.VehicleBuilder().setEngine("1500cc").setWheels(4).setAirbags(6).build();
        Vehicle bike = new Vehicle.VehicleBuilder().setEngine("200cc").setWheels(2).build();

        System.out.println("Engine : "+car.getEngine());
        System.out.println("Wheels : "+car.getWheels());
        System.out.println("AirBags : "+car.getAirBags());

        System.out.println("Engine : "+bike.getEngine());
        System.out.println("Wheels : "+bike.getWheels());
        System.out.println("AirBags : "+bike.getAirBags());


        //Using Outer Builder Class

        System.out.println("Calling Outer Builder Class");

        com.pattern.builder.outerclass.Vehicle truck = new com.pattern.builder.outerclass.VehicleBuilder().setEngine("1600cc").setWheels(8).build();

        System.out.println("Engine : "+truck.getEngine());
        System.out.println("Wheels : "+truck.getWheels());
        System.out.println("AirBags : "+truck.getAirBags());


    }
}
