public class Worker extends Person{
    private int level;
    public Worker(){};
    public Worker(String fullName, String birthday, String gender, String address, int level) {
        super(fullName, birthday, gender, address);
        this.level = level;
    }
    @Override
    public String toString() {
        return "Worker{" + super.toString()+
                "level=" + level +
                '}';
    }
}
