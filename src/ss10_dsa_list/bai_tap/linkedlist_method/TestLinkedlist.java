package ss10_dsa_list.bai_tap.linkedlist_method;

public class TestLinkedlist {
    public static void main(String[] args) {
        class Student {
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

            @Override
            public String toString() {
                return "Student: " +
                        "id= " + id +
                        ", name= " + name;
            }
        }

        NhanLinkedlist<Student> myLinkedList = new NhanLinkedlist<>();
        Student student1 = new Student(1, "Thuy");
        Student student2 = new Student(2, "Thang");
        Student student3 = new Student(3, "Thai");
        Student student4 = new Student(4, "Thanh");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2, student4);

        System.out.println("NhanLinkedlist: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        myLinkedList.remove(2);
        System.out.println("NhanLinkedlist after remove: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        NhanLinkedlist<Student> cloneLinkedList = myLinkedList.clone();
        System.out.println("CloneLinkedList: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println(cloneLinkedList.constrains(student2));
        System.out.println(cloneLinkedList.indexOf(student1));

        System.out.println("First element: " + cloneLinkedList.getFirst().toString());
        System.out.println("Last element: " + cloneLinkedList.getLast().toString());
        cloneLinkedList.clear();
        System.out.println("Clear: " + cloneLinkedList.size());
    }
}
