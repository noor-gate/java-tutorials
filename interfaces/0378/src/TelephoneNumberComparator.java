public class TelephoneNumberComparator implements PersonComparator {
    @Override
    public int compareTo(Person one, Person two) {
        return one.getTelephone().compareTo(two.getTelephone());
    }
}
