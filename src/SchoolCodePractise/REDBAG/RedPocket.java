package SchoolCodePractise.REDBAG;

public class RedPocket {
    // 基本信息
    String title;                    // 红包标题/祝福语
    double amount;                   // 红包金额
    int[] redbag_title;              // 红包编号数组
    
    // 用户信息
    String senderName;               // 发送者
    String getterName;               // 接收者
    
    // 状态管理
    boolean isSent;                  // 是否已发送
    boolean isReceived;              // 是否已领取
    boolean isOpened;                // 是否已打开
    
    // 时间信息
    long createTime;                 // 创建时间戳
    long receiveTime;                // 接收时间戳
    long expireTime;                 // 过期时间
    
    // 唯一标识
    int id;                          // 红包 ID
    static int idCounter = 0;        // ID 计数器
    
    // 其他属性
    String message;                  // 留言/备注
    int packetType;                  // 红包类型
    
    // 构造方法
    public RedPocket() {
        this.id = ++idCounter;
        this.createTime = System.currentTimeMillis();
        this.isSent = false;
        this.isReceived = false;
        this.isOpened = false;
    }
    
    // ==================== 设置类方法 ====================
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setRedbag_title(int[] redbag_title) {
        this.redbag_title = redbag_title;
    }
    
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    
    public void setGetterName(String getterName) {
        this.getterName = getterName;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
    
    // ==================== 获取类方法 ====================
    public String getTitle() {
        return title;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public int[] getRedbag_title() {
        return redbag_title;
    }
    
    public String getSenderName() {
        return senderName;
    }
    
    public String getGetterName() {
        return getterName;
    }
    
    public String getMessage() {
        return message;
    }
    
    public int getId() {
        return id;
    }
    
    public long getCreateTime() {
        return createTime;
    }
    
    public long getReceiveTime() {
        return receiveTime;
    }
    
    public long getExpireTime() {
        return expireTime;
    }
    
    public int getPacketType() {
        return packetType;
    }
    
    // ==================== 状态查询方法 ====================
    public boolean isSent() {
        return isSent;
    }
    
    public boolean isReceived() {
        return isReceived;
    }
    
    public boolean isOpened() {
        return isOpened;
    }
    
    public boolean isExpired() {
        return System.currentTimeMillis() > expireTime;
    }
    
    // ==================== 核心业务方法 ====================
    public void send() {
        if (amount <= 0) {
            System.out.println("金额无效，发送失败！");
            return;
        }
        if (title == null || title.isEmpty()) {
            System.out.println("标题不能为空，发送失败！");
            return;
        }
        this.isSent = true;
        System.out.println("红包发送成功！");
    }
    
    public boolean receive(String getterName) {
        if (!isSent) {
            System.out.println("红包还未发送，无法领取！");
            return false;
        }
        if (isReceived) {
            System.out.println("红包已被领取！");
            return false;
        }
        if (isExpired()) {
            System.out.println("红包已过期！");
            return false;
        }
        this.getterName = getterName;
        this.isReceived = true;
        this.receiveTime = System.currentTimeMillis();
        System.out.println("红包领取成功！");
        return true;
    }
    
    public void open() {
        if (!isReceived) {
            System.out.println("请领取红包！");
            return;
        }
        this.isOpened = true;
        System.out.println("红包已打开，金额：" + amount);
    }
    
    // ==================== 信息的显示方法 ====================
    public void showInfo() {
        System.out.println("==== 红包信息 ====");
        System.out.println("ID: " + id);
        System.out.println("标题：" + title);
        System.out.println("金额：" + amount);
        System.out.println("发送者：" + senderName);
        System.out.println("接收者：" + (getterName == null ? "未领取" : getterName));
        System.out.println("留言：" + (message == null ? "无" : message));
        System.out.println("状态：" + getStatusString());
        System.out.println("================");
    }
    
    private String getStatusString() {
        if (!isSent) return "未发送";
        if (isExpired()) return "已过期";
        if (!isReceived) return "待领取";
        if (!isOpened) return "待打开";
        return "已领取";
    }
}
