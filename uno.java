public class uno {
    public static void main(String args[]) {
        System.out.println("Hello world");
        main();
    }
    public static void main() {
        for(int i=1; i<=10; i++) {
            if (i<3) {
                System.out.println("Um, actually,");
            } else {
                System.out.println("I don't like turtles.");
            }
            System.out.println("I like turtles.");
        }
    }
}