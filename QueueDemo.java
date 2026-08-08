
class Queue{
    int [] que=new int[10];
    int front,rear;

    void initialize(){
        front=0;
        rear=0;
    }

    void enque(int n){
        if(rear>9)
            System.out.println("Queue is full");
        else {
            que[rear]=n;
            rear++;
        }
    }

    int  dequeue(){
        if(front==rear)
        {
            System.out.println("The queue is empty");
            return -1;
        }
        else front++;

        return que[front];
    }

}

public class QueueDemo {
   public static void main(String[] args) {
        Queue q=new Queue() ;
        q.initialize();
        for(int i=1;i<=10;i++){
            q.enque(i);
        }
        q.enque(20);

        for(int i=0;i<10;i++){
            System.out.println(q.dequeue());
        }
        q.dequeue();

    }
}
