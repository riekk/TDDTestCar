import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_to_create_car_velocity_is_0() {
        Car newCar = new Car();
        Assertions.assertEquals(0, newCar.velocity);
    }
}
