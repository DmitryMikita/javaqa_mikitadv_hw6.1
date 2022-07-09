import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesStatTest {
    @Test
    public void salesAmountTest() {
long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();
long actual = service.salesAmount(sales);
long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18);
assertEquals(actual, expected);

    }
    @Test
    public void averageSalesTest() {
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();
        int numberMonth = 12;
        long actual = service.averageSales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18)/numberMonth;
        assertEquals(actual, expected);

    }
    @Test
    public void aboveAvgSalesTest() {
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();

        long actual = service.aboveAvgSales(sales);
        long expected = 5;
        assertEquals(actual, expected);

    }
    @Test
    public void belowAvgSalesTest() {
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();

        long actual = service.belowAvgSales(sales);
        long expected = 5;
        assertEquals(actual, expected);

    }
    @Test
    public void getMonthMinSales() {
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();

        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(actual, expected);

    }
    @Test
    public void getMonthMaxSales() {
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        SalesStat service = new SalesStat();

        long actual = service.maxSales(sales);
        long expected = 8;
        assertEquals(actual, expected);

    }
}
