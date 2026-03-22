public class Iterations {
    public static void main(String[] args) {
        // 1. For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // 3. While loop
        int score = 100;
        do {
            System.out.println("This runs at least once!");
            score++;
        } while (score < 10);

        // 4. For-each
        String[] students = { "Shobhit", "Amit", "Rahul" };
        for (String s : students) {
            System.out.println("Student Name: " + s);
        }

        // 5. Control Statements: break and continue
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue; // Skip 5
            if (i == 8)
                break; // Stop completely at 8
            System.out.print(i + " "); // Output: 1 2 3 4 6 7
        }
        
    }
}
