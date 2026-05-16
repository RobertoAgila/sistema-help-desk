public class Tecnico implements IObservador {
    private String nombre;
    
    public Tecnico(String nombre) { this.nombre = nombre; }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Técnico " + nombre + " recibió alerta: " + mensaje);
    }
}
