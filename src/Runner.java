public class Runner {
    public static void main(String[] args){

        School b = new School("Berkeley High");
        Section c = new Section("Math");
        Section d = new Section("Biology");
        Section e = new Section("Computer Science");
        Teacher A = new Teacher("Albinson", "Computer Science");
        Teacher M = new Teacher("Mueller", "Biology");
        Teacher a = new Teacher("Austera", "Math");
        Student Emmett = new Student("Emmett", 11);
        Student Soroosh = new Student("Soroosh", 11);
        Student Lucas = new Student("Lucas", 11);
        Student Logan = new Student("Logan", 11);
        Student Noam = new Student("Noam", 11);
        Student Flyn = new Student("Flyn", 11);



        b.addSection(c);
        b.addSection(d);
        b.addSection(e);

        c.setTeacher(a);
        d.setTeacher(M);
        e.setTeacher(A);

        A.addSection(e);
        M.addSection(d);
        a.addSection(c);

        c.addStudent(Emmett);
        c.addStudent(Lucas);
        c.addStudent(Logan);
        d.addStudent(Noam);
        d.addStudent(Emmett);
        d.addStudent(Soroosh);
        e.addStudent(Noam);
        e.addStudent(Lucas);
        e.addStudent(Flyn);

        Emmett.addSection(c);
        Lucas.addSection(c);
        Logan.addSection(c);
        Noam.addSection(d);
        Emmett.addSection(d);
        Soroosh.addSection(d);
        Noam.addSection(e);
        Lucas.addSection(e);
        Flyn.addSection(e);



        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(A.toString());
        System.out.println(M.toString());
        System.out.println(a.toString());
        System.out.println(Emmett.toString());
        System.out.println(Soroosh.toString());
        System.out.println(Lucas.toString());
        System.out.println(Logan.toString());
        System.out.println(Noam.toString());
        System.out.println(Flyn.toString());






    }

}
