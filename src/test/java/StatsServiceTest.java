import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.services.StatsService;

public class StatsServiceTest {

    @Test
    public void sumOfAllSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long expectd = 117; // Сумма всех покупок
        long actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expectd, actual);

    }

    @Test
    public void averageOfAllSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long sum = 117;
        long expectd = 13; // Среднее относительно всех покупок
        long actual = service.averageOfAllSales(sales, sum);
        Assertions.assertEquals(expectd, actual);
    }

    @Test
    public void monthWithMinSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long expectd = 9; //Число 5 на 9 позиции в массиве
        long actual = service.monthWithMinSales(sales);
        Assertions.assertEquals(expectd, actual);

    }

    @Test
    public void monthWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long expectd = 6; //Число 20 на 6 позиции в массиве
        long actual = service.monthWithMaxSales(sales);
        Assertions.assertEquals(expectd, actual);
    }

    @Test
    public void salesBeloveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long average = 13;
        long expectd = 3; //Количество мес. ниже среднего по продажам
        long actual = service.salesBeloveAverage(sales, average);
        Assertions.assertEquals(expectd, actual);
    }

    @Test
    public void salesAboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {7, 5, 15, 17, 20, 20, 14, 14, 5};
        long average = 13;
        long expectd = 6; //Количество мес. выше среднего по продажам
        long actual = service.salesAboveAverage(sales, average);
        Assertions.assertEquals(expectd, actual);
    }
}