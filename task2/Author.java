package src.ru.mirea.task2;

class Author {
   private String name;
   private String email;
   private char gender;
   Author(String name,String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
   }
   String getName() {
       return name;
   }
   String getEmail() {
        return email;
   }
   char getGender() {
        return gender;
   }
   void setEmail(String newEmail) {
       email = newEmail;
   }
   @Override
    public String toString() {
       String outputStr = "Teacher object: " + name + "\nemail: " + email + "\ngender: " + gender;
        return outputStr;
   }
}
