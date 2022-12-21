import com.pattern.facade.OrderFacade;

public class FacadeClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.orderFood();
    }
}
