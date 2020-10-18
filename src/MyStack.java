import java.util.EmptyStackException;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[this.size];
    }

    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[index] = num;
        System.out.println(num+" da duoc them vao Stack");
        index++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int temp = arr[index-1];
        arr[index-1] = 0;
        index--;
        return temp;
    }

    public int size() {
        return index;
    }
}
