package SchoolCodePractise.GroupRedBag;

public class TransferPocket extends RedPocket {
    private boolean isGrabbed;

    public TransferPocket(User sender, double amount) {
        super(sender, amount);
        this.isGrabbed = false;
    }

    @Override
    public double grab(User user) {
        if (isGrabbed) {
            System.out.println("转账已被领取！");
            return 0;
        }

        isGrabbed = true;
        finished = true;
        remainAmount = 0;

        return totalAmount;
    }
}
