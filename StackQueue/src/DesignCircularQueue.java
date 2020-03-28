public class DesignCircularQueue {
    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    public DesignCircularQueue(int k){
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
        this.capacity = k;
    }

    public boolean enQueue(int val){
        if (count == capacity) return false;

        queue[(headIndex + count) % capacity] = val;
        count++;
        return true;
    }

    public boolean deQueue(){
        if (count == 0) return false;

        headIndex = (headIndex + 1) % capacity; // move the headIndex to the next one as deletion
        count--;
        return true;
    }

    public int front(){
        if (count == 0) return -1;
        return queue[headIndex];
    }

    public int rear(){
        if (count == 0) return -1;
        return queue[(headIndex + count - 1) % capacity];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == capacity;
    }
}
