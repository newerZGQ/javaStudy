public class VolatileTest implements Test {
    private volatile int count = 0;
    private Runnable runnable = () -> {
        for (int i = 0; i < 1000; i++) {
            count = count + 1;
            System.out.println(count);
        }
    };

    @Override
    public void doTest() {
        for (int i = 0; i < 1000; i++) {
            new Thread(runnable).start();
        }
    }
}
