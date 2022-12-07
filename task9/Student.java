package src.ru.mirea.task9;

class Student implements Comparable<Student>{
    int ID;
    String name;
    public Student(int id) {
        this.ID = id;
    }
    public Student(int id, String name) {
        this(id);
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(Student o) {
        return this.getID() - o.getID();
    }

    @Override
    public String toString() {
        return "Student {" + ID + "}";
    }
}
