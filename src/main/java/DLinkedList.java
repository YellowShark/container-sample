import java.util.Objects;

public class DLinkedList<T> {

    private Node<T> head;
    private int size;

    public DLinkedList() {
        head = null;
        size = 0;
    }

    public void pushBack(T data) {
        var h = head;
        var temp = new Node<>(data);
        temp.next = null;
        if (h == null) {
            head = temp;
        } else {
            while (h.next != null) {
                h = h.next;
            }
            h.next = temp;
        }
        size++;
    }

    public void pushFront(T data) {
        var temp = new Node<>(data);
        temp.next = head;
        head = temp;
        size++;
    }

    public void popFront() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    public void popBack() {
        if (size == 0) return;
        if (size == 1) {
            head = null;
            size = 0;
            return;
        }
        var h = head;
        while (h.next.next != null) {
            h = h.next;
        }
        h.next = null;
        size--;
    }

    public void delete(int position) {
        if (position < 0 || position > size - 1) return;
        else if (position == 0) popFront();
        else if (position == size - 1) popBack();
        else {
            var currPos = 0;
            var h = head;
            while (position - 1 != currPos) {
                h = h.next;
                currPos++;
            }
            if (h.next != null && h.next.next != null)
                h.next = h.next.next;
        }
    }

    public void insert(int position, T data) {
        if (position < 0 || position > size) return;
        if (position == 0) pushFront(data);
        else if (position == size) pushBack(data);
        else {
            var currPos = 0;
            var h = head;
            while (position - 1 != currPos) {
                h = h.next;
                currPos++;
            }
            var temp = new Node<>(data);
            temp.next = h.next;
            h.next = temp;
        }
    }

    public T get(int position) {
        if (position < 0 || position > size - 1) throw new IndexOutOfBoundsException();
        var currPos = 0;
        var h = head;
        while (position != currPos) {
            h = h.next;
            currPos++;
        }
        return h.data;
    }

    public void printList() {
        if (size == 0) {
            System.out.println("Empty list");
            return;
        }
        var h = head;
        System.out.println("List: ");
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var h = head;
        while (h != null) {
            sb.append(h.data).append(" ");
            h = h.next;
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DLinkedList<?> that = (DLinkedList<?>) o;
        return size == that.size && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, size);
    }
}