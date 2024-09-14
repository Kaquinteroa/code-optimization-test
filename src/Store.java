public class Store {
    //definir constantes
    static final int[] PRODUCT_PRICES = (15, 10, 5);
    static final int[] PRODUCT_QUANTITIES = (2, 3, 4);
    static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {

        if(PRODUCT_PRICES.length != PRODUCT_QUANTITIES.length){
            System.out.println()
        }

        
        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
