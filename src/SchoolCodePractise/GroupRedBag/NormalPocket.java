package SchoolCodePractise.GroupRedBag;

import java.util.Random;

public class NormalPocket extends RedPocket{
    private int remainCount;

    public NormalPocket(User sender, int count, double totalAmount) {
        super(sender, totalAmount);
        this.remainCount = count;
    }

    @Override
    public double grab(User user) {
        if(finished){
            System.out.println(" 红包已被抢完！");
            return 0;
        }
        double amount;
        if(remainCount == 1){
            amount=remainAmount;
        }else{
            Random random = new Random();
            double max =remainAmount*0.6;
            double min=0.01;
            amount = min + random.nextDouble()*(max-min);
            amount=(int)(amount*100)/100.0;
        }
        remainAmount-=amount;
        remainAmount=(int)(remainAmount*100)/100.0;
        remainCount--;
        if(remainCount==0){
            finished=true;
        }
        return amount;
    }

}
