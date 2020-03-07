public class SurnameComparator implements PersonComparator {

    @Override
    public int compareTo(Person one, Person two) {
        return one.getSurname().compareTo(two.getSurname());
    }
}
