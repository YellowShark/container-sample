import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var list = new DLinkedList<Integer>();
        var command = 1;
        do {
            var in = new Scanner(System.in);
            System.out.println("Input command:");
            System.out.println("1: pushBack");
            System.out.println("2: pushFront");
            System.out.println("3: popFront");
            System.out.println("4: popBack");
            System.out.println("5: insert");
            System.out.println("6: delete");
            System.out.println("7: get");
            System.out.println("8: print");
            System.out.println("0: exit");

            command = in.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Input value");
                    var i = in.nextInt();
                    list.pushBack(i);
                    break;
                }
                case 2: {
                    System.out.println("Input value");
                    var i = in.nextInt();
                    list.pushFront(i);
                    break;
                }
                case 3: {
                    list.popFront();
                    break;
                }
                case 4: {
                    list.popBack();
                    break;
                }
                case 5: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    System.out.println("Input value");
                    var value = in.nextInt();
                    list.insert(position, value);
                    break;
                }
                case 6: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    list.delete(position);
                    break;
                }
                case 7: {
                    System.out.println("Input position");
                    var position = in.nextInt();
                    System.out.println(list.get(position));
                    break;
                }
                case 8: {
                    list.printList();
                    break;
                }
                default: {
                }
            }

        } while (command != 0);
    }
}
