public class CustomStackUsingNode {
    class StackNode {
        int data;
        StackNode next;

        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    StackNode top;

    CustomStackUsingNode() {
        this.top = null;
    }

    public static void main(String[] args) {
        CustomStackUsingNode st = new CustomStackUsingNode();
    }
}
