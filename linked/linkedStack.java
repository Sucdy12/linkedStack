package linked;

public class linkedStack <T> {

    int count;
    Node<T> top;  //head

    linkedStack() {
        count = 0;
        top = null;
    }

    //operations
    //size
    int size() {
        return count;
    }

    //isempty
    boolean isEmpty() {
        return count == 0; // top == null;
    }

    //push
    public void push(T element) {
        Node<T> tempAddress = new Node<>(element);
        //System.out.println("temp address: " + tempAddress);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        T removedElement = top.getElement();
        top = top.getNext();
        count--;
        return removedElement;
    }

    //peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }

    //display linkedstack elements
    void display() {
        //if is empty
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            Node<T> currentAddress = top;
            while (currentAddress != null) {
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
    }

    //searchElement
    void searchElement(T data) {
        boolean found = false;
        int counter = 0;
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            Node<T> currentAddress = top;
            while (currentAddress != null) {
                if (data.equals(currentAddress.getElement())) {
                    found = true;
                    counter++;
                }
                currentAddress = currentAddress.getNext();
            }
        }
        //display result
        if (found == false)
            System.out.println("not found!");
        else
            System.out.println("found " + counter + " times");


}
    // method remove middle elements
    public void removeMiddle() {

        if (isEmpty()) {
            System.out.println("The is empty");

            return;
        }

        if (count <= 2) {
            System.out.println("The stack is size is small");
            return;
        }


        Node<T> currentAddress = top;
        Node<T> secondNode = currentAddress.getNext();

        Node<T> lastNode = top;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        currentAddress.setNext(lastNode);

    }









        //main method
        public static void main(String[] args) {

            linkedStack<String> names = new linkedStack<>();

            names.push("Sucdi");
            names.push("faiza");
            names.push("Halima");
            names.push("Hawa");
            names.push("muna");



           // System.out.println("After Remove Item " + names.RemovedElements("Halima" "Hawa"));


            System.out.println("Before Removing Middle Elements: ");
            names.display();
            names.removeMiddle();
            System.out.println("After Removing Middle Elements: " );
            names.display();





        }
    }

