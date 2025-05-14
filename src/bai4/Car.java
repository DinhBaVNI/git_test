package bai4;

public class Car extends Vehicle {

    @Override
    void abstractsion_move() {
        System.out.println("Car is moving");
        for (int i = 0; i < 10; i++) {
            System.out.println("Car running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
