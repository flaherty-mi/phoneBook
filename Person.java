
/*
 Meghan Flaherty & Adam Curtin
 constructor class
*/

public class Person {
    private String firstNames;
    private String lastNames;
    private String addresses;
    private String cities;
    private String phoneNumbers;

    public Person(String firstNames, String lastNames, String addresses, String cities, String phoneNumbers) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.addresses = addresses;
        this.cities = cities;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return String.format("First name: %s Last name: %s Address: %s City: %s Phone number: (360) %s",
                firstNames, lastNames, addresses, cities, phoneNumbers);
    }
}
