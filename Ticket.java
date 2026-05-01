public abstract class Ticket {
    protected int id;
    protected String descripcion;
    protected String estado;

    public abstract void resolverFallo();
}
