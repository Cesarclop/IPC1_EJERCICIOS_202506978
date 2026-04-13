public class ListaDobleEstudiantes {
    private NodoEstudianteDoble cabeza;
    private NodoEstudianteDoble cola;

    public ListaDobleEstudiantes() {
        cabeza = null;
        cola = null;
    }

    public void agregarInicio(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }

    public void agregarFinal(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.setAnterior(cola);
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
    }

    public boolean eliminarPorCarnet(String carnet) {
        NodoEstudianteDoble actual = cabeza;
        while (actual != null) {
            if (actual.getCarnet().equals(carnet)) {
                if (actual == cabeza) {
                    cabeza = cabeza.getSiguiente();
                    if (cabeza != null) cabeza.setAnterior(null);
                    else cola = null;
                } else if (actual == cola) {
                    cola = cola.getAnterior();
                    if (cola != null) cola.setSiguiente(null);
                    else cabeza = null;
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void imprimirAdelante() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoEstudianteDoble actual = cabeza;
        while (actual != null) {
            System.out.printf("Carnet: %s, Nombre: %s, Nota: %.2f%n",
                    actual.getCarnet(), actual.getNombre(), actual.getNota());
            actual = actual.getSiguiente();
        }
    }

    public void imprimirAtras() {
        if (cola == null) {
            System.out.println("Lista vacía");
            return;
        }
        NodoEstudianteDoble actual = cola;
        while (actual != null) {
            System.out.printf("Carnet: %s, Nombre: %s, Nota: %.2f%n",
                    actual.getCarnet(), actual.getNombre(), actual.getNota());
            actual = actual.getAnterior();
        }
    }

    public void insertarOrdenado(String carnet, String nombre, double nota) {
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if (cabeza == null) {
            cabeza = cola = nuevo;
            return;
        }
        if (nota <= cabeza.getNota()) {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            return;
        }
        if (nota >= cola.getNota()) {
            nuevo.setAnterior(cola);
            cola.setSiguiente(nuevo);
            cola = nuevo;
            return;
        }
        NodoEstudianteDoble actual = cabeza;
        while (actual != null && actual.getNota() < nota) {
            actual = actual.getSiguiente();
        }
        nuevo.setSiguiente(actual);
        nuevo.setAnterior(actual.getAnterior());
        actual.getAnterior().setSiguiente(nuevo);
        actual.setAnterior(nuevo);
    }
}