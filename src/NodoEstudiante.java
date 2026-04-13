public class NodoEstudiante {
    private String carnet;
    private String nombre;
    private double nota;
    private NodoEstudiante siguiente;

    public NodoEstudiante(String carnet, String nombre, double nota) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.siguiente = null;
    }

    public String getCarnet() { return carnet; }
    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    public NodoEstudiante getSiguiente() { return siguiente; }
    public void setSiguiente(NodoEstudiante siguiente) { this.siguiente = siguiente; }
}