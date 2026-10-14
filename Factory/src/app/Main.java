package app;

import factory.NotificationFactory;
import service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.notifyUser("whatsapp", "333 789 1234", "start order");
        service.notifyUser("email", "juan.55@gmail.com", "hello, you are in your email");
        service.notifyUser("sms", "311 456 7890", "code: 1111");
    }
}