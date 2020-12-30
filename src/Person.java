public class Person {
    private String fullName;
    private String birthday;
    private String gender;
    private String address;

    public String getFullName() {
        return fullName;
    }
    public Person(){};

    public Person(String fullName, String birthday, String gender, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
