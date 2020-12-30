public class Engineer extends Person{
    private String specialized;
    public Engineer(){};
    public Engineer(String fullName, String birthday, String gender, String address, String specialized) {
        super(fullName, birthday, gender, address);
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Engineer{" +super.toString()+
                "specialized='" + specialized + '\'' +
                '}';
    }
}
