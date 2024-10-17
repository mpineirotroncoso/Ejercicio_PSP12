public class HiloIncrementa extends Thread{
    private Contador contador;

    public HiloIncrementa(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            contador.incrementar();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
