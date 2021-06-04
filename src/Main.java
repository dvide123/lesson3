public class Main {

    public static void main(String[] args) {
        Student studentOne = new Student("Artur", 1);
        Student studentTwo = new Student("Mark", 1);

        System.out.println(studentOne.toString() + studentTwo.toString());
        System.out.println(studentOne.equals(studentTwo));
    }
}
