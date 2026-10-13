
class MovieTicket {
    String customer, movie;
    double price;
    int tickets;

    MovieTicket() {
        customer = "Arjun";
        movie = "Avatar";
        price = 200;
        tickets = 2;
    }

    MovieTicket(String c, String m, double p, int t) {
        customer = c;
        movie = m;
        price = p;
        tickets = t;
    }

    void book(int t) {
        tickets = t;
    }

    void book(String c, int t) {
        customer = c;
        tickets = t;
    }

    void display() {
        if (tickets <= 0) {
            System.out.println("Booking Failed");
            return;
        }

        double total = price * tickets;
        double discount = tickets >= 5 ? total * 0.1 : 0;

        System.out.println("Customer: " + customer.toUpperCase());
        System.out.println("Movie: " + movie.toUpperCase());
        System.out.println("Tickets: " + tickets);
        System.out.println("Total: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount: Rs. " + (total - discount));
    }

    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket("Sneha", "Avatar", 200, 5);
        m1.display();

        MovieTicket m2 = new MovieTicket();
        m2.book("Arjun", 2);
        m2.display();

        System.out.println(m1.customer.equalsIgnoreCase(m2.customer));
    }
}
