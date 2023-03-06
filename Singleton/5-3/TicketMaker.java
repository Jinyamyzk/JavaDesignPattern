public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticketNumber = 1000;

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTIcketNumber() {
        return ticketNumber++;
    }
}
