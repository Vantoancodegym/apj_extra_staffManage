public class Staff extends Person{
    private String job;
    public Staff(){};
    public Staff(String fullName, String birthday, String gender, String address, String job) {
        super(fullName, birthday, gender, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" +super.toString()+
                "job='" + job + '\'' +
                '}';
    }
}
