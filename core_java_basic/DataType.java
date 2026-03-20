public class DataType {
    public static void main(String[] args) {
        // There are 2 different type of Data Type:--

        // A. Primitive Data Type
        // 1. byte --> 1-byte
        // 2. boolean --> 1-bit
        // 3. char --> 2-byte
        // 4. short --> 2-byte
        // 5. int --> 4-byte
        // 6. long --> 8-byte
        // 7. double --> 8-byte
        // 8. float --> 4-byte

        // Integer types
        int age = 21;
        long population = 7800000000L;

        // Decimal types
        float price = 99.99f;
        double pi = 3.141592653;

        // Character
        char grade = 'A';

        // Boolean
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

        // B. Non-Primitive Data Type
        // These store reference (address) of the object, not the actual value.
        //Examples: String,Arrays,Classes,Objects

        // String (object)
        String name = "Shobhit";
        // Array
        int[] numbers = {10, 20, 30};

        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
    }
}
