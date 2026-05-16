/**
 * Clase que representa un incidente de Hardware.
 * Hereda de la clase abstracta Ticket.
 */
public class TicketHardware extends Ticket {

    public TicketHardware() {
        this.descripcion = "Fallo detectado en componentes físicos (Hardware)";
        this.estado = "Abierto";
    }

    @Override
    public void resolverFallo() {
        // Lógica simulada para reparar hardware
        System.out.println("Iniciando revisión técnica del equipo físico...");
        this.estado = "En reparación";
        System.out.println("Resultado: Pieza reemplazada. Ticket de Hardware finalizado.");
        this.estado = "Cerrado";
    }
}
