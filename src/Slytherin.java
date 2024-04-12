public class Slytherin extends Student {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(String name, String surname, int magical, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magical, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println("Slytherin properties: ");
        System.out.println("Cunning: " + cunning);
        System.out.println("Determination: " + determination);
        System.out.println("Ambition: " + ambition);
        System.out.println("Resourcefulness: " + resourcefulness);
        System.out.println("thirstForPower: " + thirstForPower);
    }

    public void compareWith(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower;
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " is the best student in Slytherin");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " is the best student in Slytherin");
        } else {
            System.out.println("Among " + student1.getName() + " and " + student2.getName() + " the same amount of Slytherin properties");
        }
    }
}
