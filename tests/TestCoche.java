import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_to_create_car_velocity_is_0_ChristianTM() {
        Car newCar = new Car();
        Assertions.assertEquals(0, newCar.velocity);
    }

    @Test
    public void test_acelerate_car_velocity_increase_ChristianTM() {
        Car newCar = new Car();
        newCar.acelerate_ChristianTM(30);
        Assertions.assertEquals(30, newCar.velocity);
    }

    @Test
    public void test_desacelerate_car_velocity_decrease_ChristianTM() {
        Car newCar = new Car();
        newCar.velocity = 50;
        newCar.desacelerate_ChristianTM(20);
        Assertions.assertEquals(30, newCar.velocity);
    }
    @Test
    public void test_desacelerate_car_velocity_decrease_cant_under_0_ChristianTM() {
        Car newCar = new Car();
        newCar.velocity = 50;
        newCar.desacelerate_ChristianTM(80);
        Assertions.assertEquals(0, newCar.velocity);
    }
}
