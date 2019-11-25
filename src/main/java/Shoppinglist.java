import java.util.ArrayList;
import java.util.List;

public class Shoppinglist {

    private String name;
    private User user;
    private User userlist;

    private List<Product> Productlist1 = new ArrayList<>();//Lista de produtos para comprar
    private List<Product> Productlist2 = new ArrayList<>();// Lista de produtos já no carrinho
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

    public void setUser(User user) {
        this.user = user;
    }

    public double GetPercentageCompleted(){
        double percent = 0;
        int sizeList = Productlist1.size(); // tamanho da lista de produtos para comprar
        int sizeCarrinhoList = Productlist2.size();// tamanho lista carrinho de compras
        percent= (sizeCarrinhoList*100)/sizeList;// percentagem de produtos no carrinho de compras
        return percent; //retornar percentagem
    }
    public double GetTotalPrice(){
        double totalprice = 0;
        for(int i = 0;i<Productlist1.size();i++){

        }
        return totalprice; //retornar total
    }

    public double GetTotalPriceOnCart(){
        double totalprice = 0;
        for (int i = 0;i<Productlist2.size();i++){
            
        }
        return totalprice;//retornar total
    }
    public boolean addProduct(Product product){
        boolean success = Productlist1.add(product);
        return success;

    }
    public boolean removeProduct(Product product){
        return removeProduct(product);

    }
   public void AddProductToShoppingCart(Product product){
        Productlist1.add(product);
   }

   public void RemoveProductFromShoppingCart(Product product){
        Productlist2.add(product);
   }



}
