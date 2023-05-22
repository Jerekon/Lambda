import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Who has more words in the surname, he is more noble\n" +
                "2. If the number of words in the surname is the same, then the one who is older is more significant\n");
        List<Person> people = new ArrayList<>();
        people.add(new Person("El", "Muuhamed els sham", 19));
        people.add(new Person("Kissor", "Gason im bersun", 17));
        people.add(new Person("Ori", "De chartun of isl", 12));
        people.add(new Person("Hali", "Ne mogu Pridumati", 16));
        String printPeople = people.toString()
                .replaceAll("\\[", "")  // Delete [
                .replaceAll("]", ""); // delete ]
        System.out.printf("list of people before sorting:%s.\n", printPeople);
        System.out.println("\nTask 2: the maximum number of words in the surname is indicated");

        Collections.sort(people, (o1, o2) -> {
            public int compare(Person o1, Person o2) {
                if (o1.getSurnameSet().size() == o2.getSurnameSet().size()
                        || (!(o1.getSurnameSet().size() < maxWord)
                        && o2.getSurnameSet().size() >= maxWord))
                    return Integer.compare(o1.getAge(), o2.getAge());
                else return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
            }
        });

        System.out.printf("List after sorting:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}