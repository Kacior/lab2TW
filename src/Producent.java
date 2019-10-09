public class Producent extends Thread {
    Product product;
    public Producent(Product product){
        this.product=product;
    }
    @Override
    public void run() {
        while(true){
                this.product.setStatus(100);
            }

        }
    }

