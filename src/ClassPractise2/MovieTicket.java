package ClassPractise2;

public class MovieTicket {
    private int ticketNumber;
    private String movieName;
    private String screenTime;
    private double price;
    private String seatNumber;

    public MovieTicket() {
    }

    public MovieTicket(int ticketNumber, String movieName, String screenTime, double price, String seatNumber) {
        this.ticketNumber = ticketNumber;
        this.movieName = movieName;
        this.screenTime = screenTime;
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getScreenTime() {
        return screenTime;
    }

    public void setScreenTime(String screenTime) {
        this.screenTime = screenTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double calculateDiscountedPrice(double discountRate) {
        if (discountRate > 0 && discountRate <= 1) {
            return price * discountRate;
        }
        return price;
    }

    public void printTicketInfo() {
        System.out.println("==== 电影票信息 ====");
        System.out.println("票号：" + ticketNumber);
        System.out.println("电影名称：" + movieName);
        System.out.println("放映时间：" + screenTime);
        System.out.println("座位号：" + seatNumber);
        System.out.println("原价：" + price + " 元");
        System.out.println("====================");
    }
}
