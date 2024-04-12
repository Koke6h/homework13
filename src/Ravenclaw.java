public class Ravenclaw extends Student {
    int intelligence;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(String name, String surname, int magical, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magical, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println("Ravenclaw properties: ");
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Wit: " + wit);
        System.out.println("Creativity: " + creativity);
    }

    public void compareWith(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.creativity + student1.wit + student1.wisdom + student1.intelligence;
        int sum2 = student2.creativity + student2.wisdom + student2.wit + student2.intelligence;
        if (sum1 > sum2) {
            System.out.println(student1.name + " is the best student in Ravenclaw.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " is the best student in Ravenclaw.");
        } else {
            System.out.println("Among " + student1.name + " and " + student2.name + " the same amount of Ravenclaw properties.");
        }
    }
}
