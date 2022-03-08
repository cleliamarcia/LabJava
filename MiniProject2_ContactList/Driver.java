package MiniProject2_ContactList;

public class Driver {

    public static void main( String[] args)
    {
        boolean loop = true;
        ContactList ctList = new ContactList();

        while(loop) {

            String userInput = InputCollector.getUserInput("Enter your option: ");

            switch (userInput) {
                case "1" :
                    System.out.println("..: LISTING ALL CONTACTS :..");
                    ctList.getContacts();
                    InputCollector.isMenu = true;
                    continue;

                case "2" :
                    System.out.println("..: ADDING CONTACT INFORMATION :..");
                    Contact ct = new Contact();

                    String vName = InputCollector.getUserInput("Name: ");
                    String vEmail = InputCollector.getUserInput("E-mail: ");
                    String vCity = InputCollector.getUserInput("City: ");
                    String vMobile = InputCollector.getUserInput("Mobile phone: ");
                    String vWork = InputCollector.getUserInput("Work phone: ");
                    String vHome = InputCollector.getUserInput("Home phone: ");

                    ct.setName(vName);
                    ct.setEmail(vEmail);
                    ct.setCity(vCity);
                    ct.setMobile(vMobile);
                    ct.setWork(vWork);
                    ct.setHome(vHome);
                    ctList.Add(ct);

                    InputCollector.isMenu = true;
                    continue;

                case "3" :
                    System.out.println("..: REMOVING A CONTACT :..");
                    ctList.getContacts();
                    String vId =  InputCollector.getUserInput("Choose a Contact ID: ");
                    Contact xContact = ctList.getId(Integer.parseInt(vId));
                    if (xContact != null) {
                        ctList.Remove(xContact);
                    }
                    InputCollector.isMenu = true;
                    continue;
                case "4" :
                    System.out.println("..: UPDATING A CONTACT INFORMATION :..");
                    ctList.getContacts();
                    String uId =  InputCollector.getUserInput("Choose a Contact ID: ");

                    Contact Uct = new Contact();

                    String uName = InputCollector.getUserInput("Name: ");
                    String uEmail = InputCollector.getUserInput("E-mail: ");
                    String uCity = InputCollector.getUserInput("City: ");
                    String uMobile = InputCollector.getUserInput("Mobile phone: ");
                    String uWork = InputCollector.getUserInput("Work phone: ");
                    String uHome = InputCollector.getUserInput("Home phone: ");

                    Uct.setName(uName);
                    Uct.setEmail(uEmail);
                    Uct.setCity(uCity);
                    Uct.setMobile(uMobile);
                    Uct.setWork(uWork);
                    Uct.setHome(uHome);

                    ctList.Update(Integer.parseInt(uId), Uct);

                    InputCollector.isMenu = true;
                    continue;
                case "5" :
                    loop = false;
                    System.out.println("Thank you for using the ContactList System, Have a nice day!...");
                    break;

                default:
                    System.err.println("Input validation error! Must enter a number between 1 and 5.");
            }
        }


    }

}
