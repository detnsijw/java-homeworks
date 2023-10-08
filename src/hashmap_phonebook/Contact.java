package hashmap_phonebook;

public class Contact {
    private String groupName;
    private String name;
    private String phoneNumber;

    public Contact(String groupName, String name) {
        this.groupName = groupName;
        this.name = name;
    }

    public String getGroupName(){
        return groupName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString(){
        return name;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact that = (Contact) o;

        if (groupName != that.groupName) return false;
        if (name != that.name) return false;
        return phoneNumber != null ? phoneNumber.equals(that.phoneNumber) : that.phoneNumber == null;
    }
}