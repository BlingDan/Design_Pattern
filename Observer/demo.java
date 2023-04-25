package Observer;

public class demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new Observer1(subject);
        new Observer2(subject);

        System.out.println("state chaged 1");
        subject.setstate(1);

        System.out.println("state changed 3");
        subject.setstate(3);
    }
}
