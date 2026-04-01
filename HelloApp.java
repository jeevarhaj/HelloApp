public class HelloApp {
    public static void main(String[] args) {

        String result;

        // Check if no arguments
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                sb.append(name).append(", ");
            }

            // Remove last comma and space
            result = sb.substring(0, sb.length() - 2);
        }

        System.out.println("Hello, " + result + "!");
    }
}