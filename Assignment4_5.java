
public class Assignment4_5 {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Oranges"};

        // Use StringBuilder for efficient string building
        StringBuilder sb = new StringBuilder();

        sb.append("<ul>");

        for (String item : items) {
            sb.append("<li>").append(item).append("</li>");
        }

        sb.append("</ul>");

        // Convert to string and print
        String htmlList = sb.toString();
        System.out.println(htmlList);
    }
}
