import com.pattern.factory.Notification;
import com.pattern.factory.NotificationFactory;

public class FactoryClient {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
        notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
        notification = notificationFactory.createNotification("PUSH");
        notification.notifyUser();
    }
}
