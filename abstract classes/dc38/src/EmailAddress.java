import java.util.Set;

public abstract class EmailAddress {
    protected String identifier;

    public EmailAddress(String identifier) {
        this.identifier = identifier;
    }

    public abstract Set<EmailAddress> getTargets();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EmailAddress)) {
            return false;
        }
        EmailAddress email = (EmailAddress) obj;
        return email.identifier.equals(identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }
}
