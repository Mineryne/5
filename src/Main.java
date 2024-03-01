
public class Main {
    public static void main(String[] args) {
        interface Vehicle {
            void start();

            void stop();
        }

        class Car implements Vehicle {
            @Override
            public void start() {
                System.out.println("Car started");
            }

            @Override
            public void stop() {
                System.out.println("Car stopped");
            }
        }

        class Motorcycle implements Vehicle {
            @Override
            public void start() {
                System.out.println("Motorcycle started");
            }


            @Override
            public void stop() {
                System.out.println("Motorcycle stopped");
            }
        }

        class Main2 {
            public static void main(String[] args) {
                Vehicle[] vehicles = {new Car(), new Motorcycle()};

                for (Vehicle vehicle : vehicles) {
                    startAndStop(vehicle);
                }
            }

            private static void startAndStop(Vehicle vehicle) {
                vehicle.start();


                if (vehicle instanceof Car) {
                    Car car = (Car) vehicle;
                    car.stop();
                } else if (vehicle instanceof Motorcycle) {
                    Motorcycle motorcycle = (Motorcycle) vehicle;
                    motorcycle.stop();
                }
            }

        }
    }
}
