package school.lesson4.payment;

public class Payment {
    private Product[] array;
    private int qnt;
    private int totalCost;

    public class Product {
        private int price = 10;

        public Product() {
        }
    }

    public void buyingProduct(int qnt) {
        this.qnt+=qnt;
        array = new Product[qnt];
        for (int i = 0; i < qnt; i++) {
            array[i] = new Product();
            this.totalCost += array[i].price;
        }

    }
    public void purchaseInfo(){
        System.out.println("Total cost of purchase " + this.qnt + " products = " + this.totalCost);
    }


    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.buyingProduct(5);
        payment.purchaseInfo();

        Payment pay2 = new Payment();
        pay2.buyingProduct(2);
        pay2.purchaseInfo();

    }
}



