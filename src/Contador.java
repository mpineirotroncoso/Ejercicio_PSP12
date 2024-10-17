public class Contador {
    private int contador = 0;

    public void incrementar() {
        synchronized (this) {
            contador++;
            System.out.println("Contador:" + contador);
        }
    }

    public int getContador() {
        return contador;
    }
}
