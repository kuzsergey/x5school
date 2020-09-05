package homeWork_3.student;

public class Main {
    public static void main(String[] args) {
        Student st = new Aspirant("Alexey", "Vasin", "1b", 5.0, "scientificWork");
        System.out.println(st.getFirstName() + " " + st.getLastName() + ", группа: " + st.getGroup() +
                ", научная работа: " + ((Aspirant) st).scientificWork + ", средняя оценка: " +
                st.getAverageMark() + " - стипендия: " + st.getScholarship());

        Student[] students = new Student[]{
                new Student("Ivan", "Ivanov", "1a", 4.2),
                new Student("Petr", "Petrov", "1a", 5.0),
                new Aspirant("Alexander", "Sidorov", "1b", 4.8, "scientificWork1"),
                new Aspirant("Alexey", "Vasin", "1b", 5.0, "scientificWork2")
        };
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", группа: " + student.getGroup() +
                    ", средняя оценка: " + student.getAverageMark() + " - стипендия: " + student.getScholarship());
        }

    }
}
