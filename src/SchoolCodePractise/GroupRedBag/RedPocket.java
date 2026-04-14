package SchoolCodePractise.GroupRedBag;

public abstract class RedPocket {
    protected User sender;
    protected double totalAmount;
    protected double remainAmount;
    protected boolean finished;

    public RedPocket(User sender, double totalAmount) {
        this.sender = sender;
        this.totalAmount = totalAmount;
        this.remainAmount = totalAmount;
        this.finished = false;
    }

    public abstract double grab(User user);
}
