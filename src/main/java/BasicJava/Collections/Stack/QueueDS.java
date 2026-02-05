package Collections.Stack;

public class QueueDS {

    // FIFO approach
    // enque deque peek

    class Queu {
        static int[] arr;
        static int size;
        static int rare = -1;

        Queu(int S) {
            size = S;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rare == -1;
        }

        public static void add(int add) {
            if (rare == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rare++;
            arr[rare] = add;

        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is already empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rare; i++) {
                arr[i] = arr[i + 1];
            }
            return front;
        }

    }

}
