public class TestSutdent {
    public static void main(String[] args) {
        Peson peson = new Peson("huong", true, "ninh binh", "12/3/2003");
        System.out.println(peson);
        Student student = new Student();
        student = new Student(32345,6,"linh.@gmail.com");
        System.out.println(student);
    }
}
