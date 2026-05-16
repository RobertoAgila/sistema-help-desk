public class TicketFactory {
    public Ticket crearTicket(String tipo) {
        if (tipo.equalsIgnoreCase("Hardware")) return new TicketHardware();
        if (tipo.equalsIgnoreCase("Software")) return new TicketSoftware();
        if (tipo.equalsIgnoreCase("Red")) return new TicketRed();
        return null;
    }
}
