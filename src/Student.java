public class Student {
    String name;
    String surname;
    int transgression;
    int magic;

    public Student(String name, String surname, int magical, int transgression) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void printStudent() {
        System.out.println("Student: " + getName() + getSurname());
        System.out.println("Magic: " + getMagic() + ", transgression" + getTransgression());
    }
}
