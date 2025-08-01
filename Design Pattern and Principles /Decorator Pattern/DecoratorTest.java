interface Notifier {
    void send();
}

class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapped;

    public NotifierDecorator(Notifier notifier) {
        this.wrapped = notifier;
    }

    public void send() {
        wrapped.send();
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        super.send();
        System.out.println("Sending SMS Notification");
    }
}

class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        super.send();
        System.out.println("Sending Slack Notification");
    }
}

class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier sms = new SMSNotifierDecorator(notifier);
        Notifier slack = new SlackNotifierDecorator(sms);
        slack.send();
    }
}
