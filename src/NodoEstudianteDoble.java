public class NodoEstudianteDoble {
    private String carnet;
    private String nombre;
    private double nota;
    private NodoEstudianteDoble anterior;
    private NodoEstudianteDoble siguiente;

    public NodoEstudianteDoble(String carnet, String nombre, double nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getCarnet() { return carnet; }
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    public NodoEstudianteDoble getAnterior() { return anterior; }
    public void setAnterior(NodoEstudianteDoble anterior) { this.anterior = anterior; }
    public NodoEstudianteDoble getSiguiente() { return siguiente; }
    public void setSiguiente(NodoEstudianteDoble siguiente) { this.siguiente = siguiente; }
}