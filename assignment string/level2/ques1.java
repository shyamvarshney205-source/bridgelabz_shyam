public class ques1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Convert string to char array
        char[] chars = str.toCharArray();
        
        int count = 0;
        for (char c : chars) {
            count++;  // Increment count for each character
        }
        
        System.out.println("String: " + str);
        System.out.println("Length of string (without using length()): " + count);
    }
}
