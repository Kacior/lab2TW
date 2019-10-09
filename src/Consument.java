public class Consument extends Thread {
    Product product;
    public Consument(Product product){
        this.product=product;
    }
    @Override
    public void run() {
        while(true){
                this.product.consumeStatus();
        }
    }
}
