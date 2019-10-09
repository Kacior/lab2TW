public class Main {
    public static void main(String[] args){
        Product product = new Product();
        Buffor buffor = new Buffor(product);
        try {
            buffor.createProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
