package concurrency.RWLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class rwLock {
    private ReentrantReadWriteLock rwLock=new ReentrantReadWriteLock();

    public static void main(String[] args) {
        rwLock rwLock=new rwLock();

        rwLock.rwLock.readLock().lock();
        rwLock.rwLock.writeLock().lock();
    }
}
