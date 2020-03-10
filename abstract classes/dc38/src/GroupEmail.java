import java.util.HashSet;
import java.util.Set;

public class GroupEmail extends EmailAddress {

    private Set<EmailAddress> members;

    public GroupEmail(String identifier) {
        super(identifier);
        members = new HashSet<>();
    }

    public void addEmail(EmailAddress e) {
        members.add(e);
    }

    @Override
    public Set<EmailAddress> getTargets() {
        Set<EmailAddress> targets = new HashSet<>();

        for (EmailAddress e : members) {
            targets.addAll(e.getTargets());
        }
        return targets;
    }
}
