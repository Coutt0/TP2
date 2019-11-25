import java.util.ArrayList;
import java.util.List;

public class Shoppinglist {

    private String name;
    private User user;
    private User userlist;

    private List<Product> Productlist1 = new ArrayList<>();
    private List<Product> Productlist2 = new ArrayList<>();
    private List<User> UserList = new ArrayList<>();

    public void setProductlist1(List<Product> Productlist1){
        Productlist1 = Productlist1;
    }

    public void setProductlist2(List<Product> Productlist2){
        Productlist2 = Productlist2;
    }

    public Shoppinglist(String name,User user,User userlist,List<Product> productlist1,List<Product> productlist2,List<User> userList){
        this.name = name;
        this.user = user;
        this.userlist = userlist;
        Productlist1 = productlist1;
        Productlist2 = productlist2;
        UserList = userList;
    }

    public String getListname(){
        return  name;
    }

    public  User username(){
        return user;
    }

    public List<Product> getTotalOfProducts(){
        return Productlist1;
    }

    public List<Product> getTotalOfProductsOnShoppingCart() {
        return Productlist2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUse(User user) {
        this.user = user;
    }
    public boolean addProduct(Product product){
        boolean success = Productlist1.add(product);
        return success;

    }
    public boolean removeProduct(Product product){
        return removeProduct(product);

    }




}
