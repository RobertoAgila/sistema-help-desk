public class GestorTickets {
    private static GestorTickets instancia;
    
    // Constructor privado para que nadie más cree instancias
    private GestorTickets() {} 

    public static GestorTickets getInstancia() {
        if (instancia == null) {
            instancia = new GestorTickets();
        }
        return instancia;
    }

    public void agregarTicket(Ticket ticket) {
        System.out.println("Ticket agregado al sistema central.");
    }
}
