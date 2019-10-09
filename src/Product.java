public class Product {
    public int status=0;

    public void setStatus(int status) {
        if(this.status==0)
        this.status = status;l
    }
    public int getStatus(){
        return this.status;
    }
    public void consumeStatus(){
        this.status=0;
    }
}
