import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {

        Random random = new Random();

        Human[] humans = new Human[100];

        for (int i = 0; i < humans.length; i++) {
            String name = "user" + (i + 1);
            int age = random.nextInt(101);

            humans[i] = new Human(name, age);
        }

        int[] ageCounts = new int[101];

        for (int i = 0; i < humans.length; i++) {
            Human human = humans[i];
            int age = human.getAge();
            ageCounts[age]++;
        }

        int mostFrequentAge = 0;
        int maxCount = 0;

        for (int age = 0; age <= 100; age++) { // Возраст от 1 до 100
            if (ageCounts[age] > maxCount) {
                maxCount = ageCounts[age];
                mostFrequentAge = age;
            }
        }

        System.out.println("Возраст, который встречается чаще других: " + mostFrequentAge);

    }
}
