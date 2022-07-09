public class SalesStat {
    public long salesAmount(long[] sales) {
        int salesAmount = 0;
        for (long sale : sales) {
            salesAmount += sale;
        }
        return salesAmount;
    }

    public long averageSales(long[] sales) {
        int salesAmount = 0;
        for (long sale : sales) {
            salesAmount += sale;
        }
        return salesAmount / sales.length;
    }

    public int aboveAvgSales(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

    public int belowAvgSales(long[] sales) {
        long avg = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
}
