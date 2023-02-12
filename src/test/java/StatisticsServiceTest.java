
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    @Test
    public void findMax1() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    public void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 18, 4, 5, 34, 8, 6, 1, 11, 12};
        long expected = 34;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    public void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 28, 4, 5, 3, 18, 6, 10, 11, 12};
        long expected = 28;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


}
