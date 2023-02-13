public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long []{5, 16, 7, 28, 0, 55});

        System.out.println("Максимальное значение = " + salesManager.max());
        System.out.println("Среднее значение = " + salesManager.average());
    }
}