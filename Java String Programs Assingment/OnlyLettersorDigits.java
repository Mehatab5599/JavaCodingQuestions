public class Main {
    public static void main(String[] args) {
        String string = "abc123";
        if (string.matches("[a-zA-Z0-9]+")) {
            System.out.println("The string contains only letters and digits.");
        } else {
            System.out.println("The string contains other characters.");
        }
    }
}
