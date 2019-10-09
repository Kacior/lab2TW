public class Buffor {
    public Buffor(Product product){
        this.testProduct=product;
    }
    private Product testProduct;

    public synchronized void consumeProduct() throws InterruptedException{
        while(testProduct.getStatus()==0){
            wait();
        }
        testProduct.consumeStatus();
        System.out.println("Consumed");
        notify();
        }

        public synchronized void createProduct() throws InterruptedException{
        while(testProduct.getStatus()!=0){
            wait();
        }
            testProduct.setStatus(100);
            System.out.println("Created");
            notify();
        }
    }

