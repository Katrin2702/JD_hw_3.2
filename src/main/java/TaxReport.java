import java.util.concurrent.atomic.LongAdder;

public class TaxReport {

    private LongAdder report = new LongAdder();

    public void add(int sale) {
        report.add(sale);
    }

    public long getReport() {
        return report.sum();
    }

}
