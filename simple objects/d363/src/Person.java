import java.util.StringTokenizer;

public class Person {

    private String forenames;
    private String surname;

    private String birthDate;

    private String address;

    private String nationalInsuranceNumber;

    public Person(String forename, String surname, String birthDate,
                  String address,
                  String nationalInsuranceNumber) {
        this.forenames = forename;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    int[] birth = new int[3];
    String[] birthStr = birthDate.split("/");

  public boolean isDateOfBirthValid() {

        for (int i = 0; i < 3; i++) {
          birth[i] = Integer.parseInt(birthStr[i]);
        }

        if (birth[2] < 0 || birth[1] < 1 || birth[2] > 12 || birth[0] < 1) {
          return false;
        }

        if (birth[0] > 31 && birth[1] == 12
            || birth[0] > 30 && birth[1] == 11
            || birth[0] > (isLeapYear() ? 29 : 28) && birth[1] == 2) {
          return false;
        }

        return true;
    }

    public boolean sameAddress(Person other) {
        return address.equals(other.address);
    }

    public String getInitials() {
        String result = "";
        StringTokenizer strTok = new StringTokenizer(forenames);
        while (strTok.hasMoreTokens()) {
            result += strTok.nextToken().charAt(0);
        }
        return result + surname.charAt(0);
    }

    private boolean isLeapYear() {
        for (int i = 0; i < 3; i++) {
            birth[i] = Integer.parseInt(birthStr[i]);
        }
        // Deliberately simplified version of
        // leap year calculation
        return (birth[2] % 4 == 0);
    }

    public String toString() {

        for (int i = 0; i < 3; i++) {
            birth[i] = Integer.parseInt(birthStr[i]);
        }

        return "Name: " + forenames + " " + surname + "\n"
                + "DOB: " + birth[0] + "/" + birth[1] + "/" + birth[2] + "\n"
                + "Address: " + address + "\n"
                + "NI: " + nationalInsuranceNumber;

    }

}