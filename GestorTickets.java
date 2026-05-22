import java.util.ArrayList;
import java.util.List;

public class GestorTickets {
    private static GestorTickets instancia;
    
    // Atributos definidos en el diagrama UML
    private List<Ticket> tickets;
    private List<IObservador> observadores;
    
    // Constructor privado para que nadie más cree instancias
    private GestorTickets() {
        tickets = new ArrayList<>();
        observadores = new ArrayList<>();
    } 
 
    public static GestorTickets getInstancia() {
        if (instancia == null) {
            instancia = new GestorTickets();
        }
        return instancia;
    }
 
    public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket agregado al sistema central.");
        notificarTecnicos(); // Llama a la notificación
    }

    // Método definido en el diagrama UML
    public void notificarTecnicos() {
        for (IObservador obs : observadores) {
            obs.actualizar("Nuevo fallo detectado en el Data Center");
        }
    }
}
