import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Menu menu = new Menu("Ejercicio 12");
        menu.addEntrada("Ejecutar ejercicio");
        int opcion = menu.generarMenu();
        switch (opcion) {
            case 1:
                ejecutarEjercicio();
                break;
        }
    }

    private static void ejecutarEjercicio() {
        Contador contador = new Contador();

        HiloIncrementa hilo1 = new HiloIncrementa(contador);
        HiloIncrementa hilo2 = new HiloIncrementa(contador);
        HiloIncrementa hilo3 = new HiloIncrementa(contador);
        HiloIncrementa hilo4 = new HiloIncrementa(contador);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}