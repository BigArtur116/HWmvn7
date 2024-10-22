import ru.netology.stats.services.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 5};


        System.out.println("Сумма всех продаж " + service.sumOfAllSales(sales) + " руб.");

        System.out.println("Средняя сумма всех продаж " + service.averageOfAllSales(sales) + " руб.");

        System.out.println("Месяц " + service.monthWithMinSales(sales) + " с min продажами на сумму " + sales[service.monthWithMinSales(sales) - 1] + " руб.");

        System.out.println("Месяц " + service.monthWithMaxSales(sales) + " с max продажами на сумму " + sales[service.monthWithMaxSales(sales) - 1] + " руб.");

        System.out.println("Количество мес. ниже среднего " + service.salesBeloveAverage(sales));

        System.out.println("Количество мес. выше среднего " + service.salesAboveAverage(sales));

    }
}
