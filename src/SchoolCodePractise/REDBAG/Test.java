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
        
        // 测试 RedPocket 的属性
        redPocket.setTitle("恭喜发财");
        redPocket.setAmount(200.0);
        redPocket.setRedbag_title(new int[]{1, 2, 3});
        redPocket.setSenderName("张三");
        redPocket.setMessage("新年快乐");
        
        System.out.println("\n=== RedPocket 基本信息 ===");
        System.out.println("id: " + redPocket.getId());
        System.out.println("title: " + redPocket.getTitle());
        System.out.println("amount: " + redPocket.getAmount());
        System.out.println("redbag_title: " + java.util.Arrays.toString(redPocket.getRedbag_title()));
        System.out.println("senderName: " + redPocket.getSenderName());
        System.out.println("message: " + redPocket.getMessage());
        System.out.println("createTime: " + redPocket.getCreateTime());
        System.out.println("isSent: " + redPocket.isSent());
        
        // 测试发送功能
        //System.out.println("\n=== 测试发送功能 ===");
        redPocket.send();
        System.out.println("isSent: " + redPocket.isSent());
        
        // 测试领取功能
        //System.out.println("\n=== 测试领取功能 ===");
        redPocket.receive("李四");
        System.out.println("isReceived: " + redPocket.isReceived());
        System.out.println("getterName: " + redPocket.getGetterName());
        System.out.println("receiveTime: " + redPocket.getReceiveTime());
        
        // 测试打开功能
        //System.out.println("\n=== 测试打开功能 ===");
        redPocket.open();
        System.out.println("isOpened: " + redPocket.isOpened());
        
        // 测试展示信息功能
        //System.out.println("\n=== 测试 showInfo 方法 ===");
        redPocket.showInfo();
    }
}
