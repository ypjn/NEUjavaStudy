package SchoolCodePractise.REDBAG;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Sender sender = new Sender();
        Getter getter = new Getter();
        RedPocket redPocket = new RedPocket();
        
        // 测试 SENDER 的 getter
        sender.count = 1;
        sender.money = 100;
        sender.redbag_title = new int[]{1, 2, 3};
        sender.senderName = "张三";
        
        System.out.println("=== SENDER ===");
        System.out.println("count: " + sender.getCount());
        System.out.println("money: " + sender.getMoney());
        System.out.println("senderName: " + sender.getSenderName());
        
        // 测试 GETTER 的 getter
        getter.getterName = "李四";
        getter.receivedCount = 5;
        
        System.out.println("\n=== GETTER ===");
        System.out.println("getterName: " + getter.getGetterName());
        System.out.println("receivedCount: " + getter.getReceivedCount());
        
        // 测试 RedPocket 的 getter
        redPocket.setTitle("恭喜发财");
        redPocket.setAmount(200.0);
        redPocket.setSenderName("张三");
        redPocket.setMessage("新年快乐");
        
        System.out.println("\n=== RedPocket ===");
        System.out.println("id: " + redPocket.getId());
        System.out.println("title: " + redPocket.getTitle());
        System.out.println("amount: " + redPocket.getAmount());
        System.out.println("senderName: " + redPocket.getSenderName());
        System.out.println("message: " + redPocket.getMessage());
        System.out.println("createTime: " + redPocket.getCreateTime());
        System.out.println("isSent: " + redPocket.isSent());
    }
}
