public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{5, 16, 7, 28, 0, 55});

        System.out.println("Максимальное значение = " + salesManager.max());
    }
}