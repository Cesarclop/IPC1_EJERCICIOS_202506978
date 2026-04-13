public class Main {
    public static void main(String[] args) {
        System.out.println("=== LISTA SIMPLEMENTE ENLAZADA ===");
        ListaEstudiantes listaSimple = new ListaEstudiantes();

        listaSimple.agregarFinal("2023001", "Ana López", 85.5);
        listaSimple.agregarFinal("2023002", "Carlos Ruiz", 92.0);
        listaSimple.agregarInicio("2023003", "María Gómez", 78.0);
        listaSimple.agregarFinal("2023004", "Luis Pérez", 88.5);

        System.out.println("Lista completa:");
        listaSimple.imprimirLista();

        System.out.println("\nPromedio: " + listaSimple.obtenerPromedio());
        NodoEstudiante mejor = listaSimple.obtenerMejorNota();
        if (mejor != null)
            System.out.println("Mejor nota: " + mejor.getNombre() + " - " + mejor.getNota());

        System.out.println("\nBuscando carnet 2023002:");
        NodoEstudiante encontrado = listaSimple.buscarPorCarnet("2023002");
        if (encontrado != null)
            System.out.println("Encontrado: " + encontrado.getNombre());

        System.out.println("\nEliminando carnet 2023001:");
        listaSimple.eliminarPorCarnet("2023001");
        listaSimple.imprimirLista();

        System.out.println("\n=== LISTA DOBLEMENTE ENLAZADA ===");
        ListaDobleEstudiantes listaDoble = new ListaDobleEstudiantes();

        listaDoble.insertarOrdenado("2023010", "Laura Díaz", 91.0);
        listaDoble.insertarOrdenado("2023011", "Pedro Soto", 82.0);
        listaDoble.insertarOrdenado("2023012", "Sofía Rivas", 95.5);
        listaDoble.insertarOrdenado("2023013", "Javier Mora", 88.0);

        System.out.println("Ordenado por nota (adelante):");
        listaDoble.imprimirAdelante();

        System.out.println("\nOrdenado por nota (atrás):");
        listaDoble.imprimirAtras();

        System.out.println("\nEliminando carnet 2023011:");
        listaDoble.eliminarPorCarnet("2023011");
        listaDoble.imprimirAdelante();

        System.out.println("\nAgregando al inicio y al final:");
        listaDoble.agregarInicio("2023099", "Nueva Inicio", 60.0);
        listaDoble.agregarFinal("2023098", "Nuevo Final", 100.0);
        listaDoble.imprimirAdelante();
    }
}