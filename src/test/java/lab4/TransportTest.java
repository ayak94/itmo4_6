package lab4;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;


public class TransportTest extends TestCase {

    public void testTransport() {
        Random random = new Random(System.currentTimeMillis());
        Transport bus = new Trolleybus("yellow", "ЛиАЗ - 6213", 220, 12, 2);
        Transport car = new Car("blue", "Ferrari 248 F1", 785, 4, "sedan");
        Transport tractor = new Tractor("red", "Беларус", 37, 4, true);

        Boat boat = new Boat("red and blue", "Absolut 165", 510, false, false);
        Submarine submarine = new Submarine("black", "Акула", 1728, true, 200);
        Yacht yacht = new Yacht("white", "AZIMUT 55", 1050, true, 2);

        AirTransport helicopter = new Helicopter("grey", "МИ-24", 640, 30, 6);
        AirTransport plane = new Plane("grey", "Hughes H-4 Hercules", 7300, 20, true);

        Transport[] transport = new Transport[] {
                bus,
                car,
                tractor,
                boat,
                submarine,
                yacht,
                helicopter,
                plane
        };

        Arrays.stream(transport)
                .peek(t -> System.out.println("\n" + t.getDescription()))
                .forEach(t -> t.goToPosition(random.nextDouble() + 50, random.nextDouble() + 60));
    }
}