public class task2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        task3 s = new task3();
        s.name  = "Petryk";
        s.age = 10;
        s.avgGrade = 10/2;
        s.idCard = 124940;
        s.semester = 5;

        task3 r = new task3();
        r.name = "Kyrilcio";
        r.age = 24;
        r.avgGrade = 12/2;
        r.idCard = 214128;
        r.semester = 3;
        r.activeCard = true;
        r.displayAge();
        r.displayName();
        r.displayAvgGrade();
        r.displayCard();
        r.displayID();
        r.displaySemester();
    }
}
