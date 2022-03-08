package MiniProject2_ContactList;

import java.util.Objects;

public class Contact {

    private String Name;
    private String Email;
    private String City;
    private String Mobile;
    private String Work;
    private String Home;

    public Contact(String name, String email, String city, String mobile, String work, String home) {
        setName(name);
        setEmail(email);
        setCity(city);
        setMobile(mobile);
        setWork(work);
        setHome(home);
    }

    public Contact() {

    }

    public void setName(String name) {
        if(name.isEmpty() == false) {
               this.Name = name;

        }
        else
        {
            throw new IllegalArgumentException("Contact name invalid!");
        }
    }


    public void setEmail(String email) {
        this.Email = email.isEmpty() ? null : email;
    }

    public void setCity(String city) {
        this.City = city.isEmpty() ? null : city;
    }


    public void setMobile(String mobile) {
        if(mobile.isEmpty()== false) {
            this.Mobile = mobile;
        }
        else
            {
                throw new IllegalArgumentException("Contact mobile invalid!");
            }


    }

    public void setWork(String work) {
        this.Work = work.isEmpty() ? null : work;
    }

    public void setHome(String home) {
        this.Home = home.isEmpty() ? null : home;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
    public String getCity() {
        return City;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getWork() {
        return Work;
    }
    public String getHome() {
        return Home;
    }

}
