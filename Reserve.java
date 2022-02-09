public class Reserve<E> {
    private Node head=null;
    private Node tail=null;
    private int size=0;



    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }

    public void addFirst(E element) {
        if (size == 0) {
            tail = new Node<E>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<E>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }



    public void rotate(int i)
    {
        if (tail!=null)
            tail=tail.getNext();
    }

    public E addFirst() {
        return null;
    }


    public static class Node<E>
    {
        private E element;
        private Node next;

        public Node(E element, Node next) {
            this. element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }





}
