import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final TaxReport taxReport = new TaxReport();

        Thread t1 = new Thread(null, new Shop(array(1000), taxReport));
        Thread t2 = new Thread(null, new Shop(array(500), taxReport));
        Thread t3 = new Thread(null, new Shop(array(1500), taxReport));

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.printf("Сумма выручки за текущий день: %s руб", taxReport.getReport());
    }

    public static  int[] array(int size) {
        int maxCost = 100000;
        Random random = new Random();
        int [] array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxCost);
        }
        return array;
    }
}
