public class User {
       private String name;
       private String email;
       private String username;
       private String password;
       private Address address;

       public User(String name, String eamil,String username, String password,Address address){
           this.name = name;
           this.email= email;
           this.username = username;
           this.password = password;
       }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getStreetname(){
           return  address.getStreetname();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
