public class QueueDemo {
    int front = 0, rear = 0, size = 5;
    int[] queue = new int[size];

    void enqueue(int value) {
        if (rear == size) {
            System.out.println("Queue is full");
        } else {
            queue[rear++] = value;
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted: " + queue[front++]);
        }
    }

    void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}