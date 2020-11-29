import java.util.ArrayList;

public class Contacts {



    private  ArrayList<String> mobileContactsNames = new ArrayList<>();
    private ArrayList<Integer> phoneNumbers = new ArrayList<>();

    public void printContacts(){
        System.out.println("Those are your contacts: ");
        for (int i = 0; i< mobileContactsNames.size(); i++){
            System.out.println(mobileContactsNames.get(i) + " -- " + phoneNumbers.get(i) + ", " );

        }
    }
    public int searchContact(String name){
        return mobileContactsNames.indexOf(name);
        }


    public void storeContactName(String newContact){
        mobileContactsNames.add(newContact);
        System.out.println(newContact + " has been added to your contact list!");

    }
    public void storeContactPhoneNumber(int number){
        System.out.println("Enter contact number: ");
        phoneNumbers.add(number);
    }
    public  void modifyContactList(String existingName, String newName, int number){
        boolean exist = mobileContactsNames.contains(existingName);
        int positionName = mobileContactsNames.indexOf(existingName);
        int positionNumber = positionName;

        if (exist){
            mobileContactsNames.remove(existingName);
            phoneNumbers.remove(positionNumber);
  //          System.out.print("Enter new contact name: ");
            mobileContactsNames.add(newName);
    //        System.out.println("Enter contact number: ");
            phoneNumbers.add(number);
            System.out.println(newName + " has replaced old contact: " + existingName);

        }
    }
}
