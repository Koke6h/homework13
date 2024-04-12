public class Hogwarts {
    public static void compareStudents(Student student1, Student student2) {
        int magicalPower1 = student1.getMagic();
        int magicalPower2 = student2.getMagic();
        int transgression1 = student1.getTransgression();
        int transgression2 = student2.getTransgression();
        if (magicalPower1 > magicalPower2) {
            System.out.println(student1.getName() + " beat " + student2.getName() + " by the power of magic.");
        } else if (magicalPower2 > magicalPower1) {
            System.out.println(student2.getName() + " beat " + student1.getName() + " by the power of magic.");
        } else {
            System.out.println("Comparison between " + student1.getName() + " and " + student2.getName() + " impossible, since their powers are equal.");
        }
        if (transgression1 > transgression2) {
            System.out.println(student1.getName() + " beat " + student2.getName() + " by the power of transgression.");
        } else if (transgression2 > transgression1) {
            System.out.println(student2.getName() + " beat " + student1.getName() + " by the power of transgression.");
        } else {
            System.out.println("Comparison between " + student1.getName() + " and " + student2.getName() + " impossible, since their powers are equal.");
        }
    }

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 15, 39, 45, 65, 76);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 12, 23, 56, 78, 89);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 15, 24, 55, 31, 66);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 15, 43, 42, 45, 97, 89, 99);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 12, 19, 34, 35, 36, 36, 96);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 13, 22, 34, 56, 75, 24, 96);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 6, 34, 64, 75, 21);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 5, 43, 43, 12, 56);
        Hufflepuff justinFinchFletchley = new Hufflepuff("JustinFinch", "Fletchley", 7, 22, 44, 55, 66);

        Ravenclaw choChang = new Ravenclaw("Cho", "Chang", 3, 33, 44, 23, 43, 42);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 5, 11, 23, 53, 76, 21);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 6, 23, 43, 56, 75, 66);

        harryPotter.printStudent();
        harryPotter.compareWith(hermioneGranger, ronWeasley);
        dracoMalfoy.printStudent();
        dracoMalfoy.compareWith(grahamMontague, gregoryGoyle);
        zachariasSmith.printStudent();
        zachariasSmith.compareWith(cedricDiggory, justinFinchFletchley);
        choChang.printStudent();
        choChang.compareWith(padmaPatil, marcusBelby);
        compareStudents(hermioneGranger, dracoMalfoy);
    }
}
