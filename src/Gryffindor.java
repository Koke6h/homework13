public class Gryffindor extends Student {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(String name, String surname, int magical, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, magical, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println("Gryffindor properties: ");
        System.out.println("Nobility: " + nobility);
        System.out.println("Honor: " + honor);
        System.out.println("Bravery: " + bravery);
    }

    public void compareWith(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;
        if (sum1 > sum2) {
            System.out.println(student1.name + " is the best student in Gryffindor.");
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " is the best student in Gryffindor.");
        } else {
            System.out.println("Among " + student1.getName() + " and " + student2.getName() + " the same amount of Gryffindor properties.");
        }
    }
}
