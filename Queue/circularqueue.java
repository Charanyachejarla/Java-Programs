import java.util.Scanner;

class Implementation{
    int front=-1;
    int rear=-1;
    int maxsize=5;
    int[] arr= new int[5];
    void enqueue(int data){
        if(rear==maxsize-1){
            if((rear+1)%maxsize!=front ){
                rear=(rear+1)%maxsize;
                arr[rear]=data;
                if(front==-1)front++;
                return;
            }
            else{
                System.out.println("Queue is filled");
                return;
            }
            
        }
         arr[++rear]=data;
         if(front==-1)front++;
    }
    
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        
    }
    
    int getfront(){
        return arr[front];
    }
    
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
            return;
        }
        int start=front;
        while(start!=rear){
            System.out.print(arr[start]+" ");
            start=(start+1)%maxsize;
        }
        System.out.print(arr[start]+" ");
    }
    
    int getrear(){
        return arr[rear];
    }
}
class circularqueue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Implementation obj= new Implementation();
        obj.enqueue(5);
        obj.enqueue(15);
        obj.enqueue(25);
        obj.enqueue(35);
        obj.enqueue(45);
        obj.display();
        System.out.println();
        obj.dequeue();
        obj.display();
        obj.enqueue(55);
        
      //  int f=obj.getfront();
       // System.out.println("Front: "+f);
       // int r=obj.getrear();
       // System.out.println("rear: "+r);
        obj.display();
        
    }
}