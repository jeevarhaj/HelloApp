public class HelloApp {
    public static void main(String[] args) {
        String name;

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);
                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }

            name = sb.toString();
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}