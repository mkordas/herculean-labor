class CretanBull {

private Lock lock = new ReentrantLock();
private boolean isAlive;

public static void main(String[] args) {
CretanBull cretanBull = new CretanBull();
cretanBull.capture();
}

private void capture() {
lock.lock();
try {
if (isAlive) {
System.out.println("Captured!");
}
} finally {
lock.unlock();
}

}
