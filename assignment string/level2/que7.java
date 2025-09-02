public class que7{
    public static void main(String[] args) {
        String input = "   Hello, World!   ";
        System.out.println("Original string: '" + input + "'");

        String trimmed = manualTrim(input);

        System.out.println("Trimmed string: '" + trimmed + "'");
    }

    public static String manualTrim(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find first non-space character from the start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // If all spaces, return empty string
        if (start > end) {
            return "";
        }

        // Extract the trimmed substring manually using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
