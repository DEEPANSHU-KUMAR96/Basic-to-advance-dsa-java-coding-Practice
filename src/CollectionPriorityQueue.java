import java.util.Comparator;
import java.util.PriorityQueue;

 class CollectionPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });
        queue.offer(new Student("Deepanshu",'A'));
        queue.offer(new Student("Nehra",'C'));
        queue.offer(new Student("Deepak",'D'));
        queue.offer(new Student("preeti",'B'));
        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

    public static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
