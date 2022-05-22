public class Shop extends Thread{

    private TaxReport taxReport;
    private int[] saleArray;

    Shop(int[] saleArray, TaxReport taxReport) {
        this.saleArray = saleArray;
        this.taxReport = taxReport;
    }

        public void run () {
            for (int i = 0; i < saleArray.length; i++) {
                taxReport.add(saleArray[i]);
            }
        }

}


