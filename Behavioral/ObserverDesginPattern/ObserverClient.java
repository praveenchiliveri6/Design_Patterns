import com.pattern.observer.observable.IPhoneObservableImpl;
import com.pattern.observer.observable.StockObserverable;
import com.pattern.observer.observer.EmailAlertObserverImpl;
import com.pattern.observer.observer.MobileAlertObserverImpl;
import com.pattern.observer.observer.NotificationAlertObserver;
import com.pattern.observer.observer.PushAlertObserverImpl;

public class ObserverClient {
    public static void main(String[] args) {
        StockObserverable iphoneStock = new IPhoneObservableImpl();

        NotificationAlertObserver email = new EmailAlertObserverImpl("praveen@gmail.com",iphoneStock);
        NotificationAlertObserver mobile = new MobileAlertObserverImpl("praveen",iphoneStock);
        NotificationAlertObserver mobile1 = new MobileAlertObserverImpl("tejesh",iphoneStock);
        NotificationAlertObserver push = new PushAlertObserverImpl("praveen",iphoneStock);

        iphoneStock.subscribe(email);
        iphoneStock.subscribe(mobile);
        iphoneStock.subscribe(mobile1);
        iphoneStock.subscribe(push);

        //set the stock count to trigger the notifications.
        iphoneStock.setStockCount(10);
        iphoneStock.setStockCount(-10);
        iphoneStock.setStockCount(100);
    }
}
