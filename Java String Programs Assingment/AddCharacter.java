public class AddCharacters {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello";

        // Characters to add
        String charactersToAdd = " World";

        // Using StringBuffer to add characters
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.append(charactersToAdd);

        // Convert StringBuffer to String
        String newString = stringBuffer.toString();

        // Output the result
        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);
    }
}
