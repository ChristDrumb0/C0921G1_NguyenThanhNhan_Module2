package ss10_dsa_list.bai_tap.arraylist_method;

public class Test {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Student a = new Student(001,"Drumbo");
        Student b = new Student(002,"Dumbo");
        Student c = new Student(003,"Drmbo");
        Student d = new Student(004,"Drubo");
        Student e = new Student(005,"Drumo");
        NhanArrayList<Student> student = new NhanArrayList<>();
        NhanArrayList<Student> student2 = new NhanArrayList<>();

        student.add(a);
        student.add(b);
        student.add(c);
        student.add(d);
//        student.clear();
//        System.out.println(student.getSize());
//        System.out.println(student.get(2).getId());
//        System.out.println(student.get(2).getName());
//        System.out.println(student.indextOf(d));
//        System.out.println(student.indextOf(e));
//        System.out.println(student.contain(d));
//        System.out.println(student.contain(e));
        student2 = student.clone();
        student2.remove(1);
        for (int i=0;i<student2.getSize();i++) {
            System.out.print(student2.get(i).getId());
            System.out.println(student2.get(i).getName());
        }



//        for (int i=0;i<student.getSize();i++){
//            Student student1 = (Student) student.elements[i];
//            System.out.println(student1.getId());
//            System.out.println(student1.getName());
//
//        }
    }
}
