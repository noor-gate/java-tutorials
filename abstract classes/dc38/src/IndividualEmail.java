import java.util.HashSet;
import java.util.Set;

public class IndividualEmail extends EmailAddress {

    public IndividualEmail(String identifier) {
        super(identifier);
    }

    @Override
    public Set<EmailAddress> getTargets() {
        Set<EmailAddress> targets = new HashSet<>();
        targets.add(this);
        return targets;
    }
}
