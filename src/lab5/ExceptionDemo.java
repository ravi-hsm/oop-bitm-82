package lab5;

class GradeSystem {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78};
        int index = Integer.parseInt("4");
        System.out.println(grades[index]);
        try {
            System.out.println("Grade: " + grades[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid student index");
            System.out.println("Details: " + e.getMessage());
        } finally {
            System.out.println("System continues running...");
        }
    }
}