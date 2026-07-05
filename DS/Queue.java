class Queue {
    public static void main(String[] args) {
        QueueDS queue=new QueueDS(5);
        queue.display();
        queue.queue(7);
        queue.queue(8);
        queue.display();
        queue.queue(9);
        queue.queue(10);
        queue.queue(11);
        queue.display();
        queue.queue(8);
        queue.dequeue();
        queue.display();
    }
}

class QueueDS {
    int queueArray[], end=0;
    
    QueueDS(int size) {
        queueArray=new int[size];
    }
    
    void queue(int value) {
        if(end==queueArray.length)
            return;
        queueArray[end++]=value;
    }
    
    void dequeue() {
        if(end==0)
            return;
        System.out.println("dequeued - "+queueArray[0]);
        end--;
        for(int i=0;i<end;i++) {
            queueArray[i]=queueArray[i+1];
        }
    }
    
    void display() {
        for(int i=0;i<end;i++) {
            System.out.print(queueArray[i]+",");
        }
        System.out.println();
    }
}
