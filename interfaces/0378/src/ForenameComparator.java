public class ForenameComparator implements PersonComparator {
    @Override
    public int compareTo(Person one, Person two) {
        return one.getForename().compareTo(two.getForename());
    }
}
