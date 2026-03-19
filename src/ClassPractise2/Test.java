package ClassPractise2;

public class Test {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket(1, "The Godfather", "12:00 PM", 10.0, "4 排 5 列");
        
        m1.setTicketNumber(2);
        m1.setMovieName("Inception");
        m1.setScreenTime("15:30");
        m1.setPrice(15.0);
        m1.setSeatNumber("6 排 8 座");
        
        m2.setPrice(12.0);
        m1.setScreenTime("14:00");
        
        double m1DiscountPrice = m1.calculateDiscountedPrice(0.75);
        double m2DiscountPrice = m2.calculateDiscountedPrice(0.75);
        System.out.println("m1 折扣后价格：" + m1DiscountPrice);
        System.out.println("m2 折扣后价格：" + m2DiscountPrice);
        
        m1.printTicketInfo();
        m2.printTicketInfo();
        
        System.out.println("m1 座位号：" + m1.getSeatNumber());
        System.out.println("m1 原价：" + m1.getPrice());
    }
}
