public class q9 {
    public static void main(String[] args) {
        String[] marks = {"85", "95", "null", "88", "abc"};
        int total = 0, count = 0;
        for (String m : marks) {
            try {
                if (m != null && !m.equals("null")) {
                    Integer val = Integer.valueOf(m);
                    total += val;
                    count++;
                }
            } catch (Exception e) {}
        }
        System.out.println("Average: " + (count > 0 ? (total / count) : 0));
    }
}

