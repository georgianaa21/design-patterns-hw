package order;

public class TelOrder<T> extends Order<T> {

    public TelOrder(int id) {
        super(id);
    }

    @Override
    public void placedOrder() {
        System.out.println("This order was placed by phone!");
    }
}
