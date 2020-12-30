import java.util.ArrayList;

public class StaffManage {
    private ArrayList<Person> staffList=new ArrayList<>();
    public void addNewPerson(Person person){
        staffList.add(person);
    }
    public void searchingByNameAndDisplay(String searchingName){
        String resultOfSearching="";
        boolean isFound=false;
        for (Person person:staffList) {
            String personName=person.getFullName();
            if (searchingName.equals(personName)){
                resultOfSearching+=person.toString();
                isFound=true;
            }
        }
        if (!isFound) resultOfSearching+="name is invalid";
        System.out.println(resultOfSearching);
    }
}
