import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
       Category category1 = new Category("Desktops","Gaming","Preto");
       Category category2 = new Category("Laptops","Trabalho","Branco");
       Category category3 = new Category("Telemóveis","Iphone","Rosa");

       Product product1 = new Product("MSI","Trident","picture",category1,649,"un");
       Product product2 = new Product("HP","Pavilion","picture",category1,430,"un");
       Product product3 = new Product("Lenovo","V145","picture",category2,300,"un");
       Product product4 = new Product("Asus","Vivobook","picture",category2,350,"un");
       Product product5 = new Product("iPhone7","32GB","picture",category3,500,"un");
       Product product6 = new Product("iPhone8","32GB","picture",category3,550,"un");
       Product product7 = new Product("iPhone11","256GB","picture",category3,1450,"un");

       Address address1 = new Address("Barcelos",345,"123-1414");
       Address address2 = new Address("Braga",527,"121-1424");

       User user1 = new User("Renato","renato@gmail.com","renato","password",address1);
       User user2 = new User("Tiago","tiago@gmail.com","TIAGO","ola",address2);
    }
}
