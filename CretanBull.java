import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* Lock acquired but not safely unlocked */
class CretanBull {

    private final Lock lock = new ReentrantLock();
    private final boolean isAlive;

    CretanBull(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public static void main(String[] args) {
        CretanBull cretanBull = new CretanBull(true);
        cretanBull.capture();
    }

    private void capture() {
        lock.lock();
        if (isAlive) {
            System.out.println("Captured!");
            lock.unlock();
        }
    }
}
