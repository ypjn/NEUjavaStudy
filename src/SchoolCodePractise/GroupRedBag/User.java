package SchoolCodePractise.GroupRedBag;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private double balance;
    private List<String> history;

    public User(String userId, String userName, double balance) {
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public NormalPocket sendNormalPocket(int count, double totalAmount) {
        if (balance < totalAmount) {
            System.out.println(userName + " 余额不足！");
            return null;
        }
        balance -= totalAmount;
        NormalPocket pocket = new NormalPocket(this, count, totalAmount);
        System.out.println(userName + " 发了一个红包，总金额：" + totalAmount + "元，个数：" + count);
        return pocket;
    }

    public TransferPocket sendTransferPocket(double amount) {
        if (balance < amount) {
            System.out.println(userName + " 余额不足！");
            return null;
        }
        balance -= amount;
        TransferPocket pocket = new TransferPocket(this, amount);
        System.out.println(userName + " 发了一个转账红包，金额：" + amount + "元");
        return pocket;
    }

    public double grabPocket(RedPocket pocket) {
        double amount = pocket.grab(this);
        if (amount > 0) {
            balance += amount;
            history.add("抢到 " + amount + " 元");
            System.out.println(userName + " 抢到了 " + amount + " 元");
        }
        return amount;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void showInfo() {
        System.out.println("用户：" + userName + "，余额：" + balance + "元");
    }

    public void showHistory() {
        System.out.println(userName + " 的记录：");
        for (String record : history) {
            System.out.println("  " + record);
        }
    }
}
