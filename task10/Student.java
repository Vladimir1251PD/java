package src.ru.mirea.task10;

class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    String specialization;
    Integer courseNumber;
    String group;
    Float rating;

    public Student(String firstName, String lastName, String specialization, Integer courseNumber, String group, Float rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.courseNumber = courseNumber;
        this.group = group;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Student o) {
        if (this.rating > o.rating) return 1;
        else if (this.rating < o.rating) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", courseNumber=" + courseNumber +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                '}';
    }
}
