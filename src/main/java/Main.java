import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
       Category category1 = new Category("Desktops","Gaming","Preto");
       Category category2 = new Category("Laptops","Trabalho","Branco");
       Category category3 = new Category("Telemoveis","Iphone","Rosa");

       Product product1 = new Product("MSI","Trident","picture",category1,649,"un","msi");
       Product product2 = new Product("HP","Pavilion","picture",category1,430,"un","hp");
       Product product3 = new Product("Lenovo","V145","picture",category2,300,"un","asus");
       Product product4 = new Product("Asus","Vivobook","picture",category2,350,"un","asus");
       Product product5 = new Product("iPhone7","32GB","picture",category3,500,"un","apple");
       Product product6 = new Product("iPhone8","32GB","picture",category3,550,"un","apple");
       Product product7 = new Product("iPhone11","256GB","picture",category3,1450,"un","apple");

       Address address1 = new Address("Barcelos",345,"123-1414");
       Address address2 = new Address("Braga",527,"121-1424");

       User user1 = new User("Renato","renato@gmail.com","renato","password",address1);
       User user2 = new User("Tiago","tiago@gmail.com","TIAGO","ola",address2);
       User user3 = new User("Joao","joao@gmail.com","Joao","ola1",address2);
       List<User> UserList = new ArrayList<>();
       UserList.add(user1);
       UserList.add(user2);
       UserList.add(user3);

       List<Product> newProductList1 = new ArrayList<>();
               newProductList1.add(product1);
               newProductList1.add(product2);
               newProductList1.add(product3);
               newProductList1.add(product4);
               newProductList1.add(product5);
               newProductList1.add(product6);
               newProductList1.add(product7);

       List<Product> newProductList2 = new ArrayList<>();
              newProductList2.add(product6);
              newProductList2.add(product1);

       Shoppinglist list1=new Shoppinglist("Lista1",user1,newProductList1,newProductList2,UserList);
       Shoppinglist list2=new Shoppinglist("Lista2",user1,newProductList1,newProductList2,UserList);

       //Username das pessoas que partilham a lista
       System.out.println("Lista Partilhada por:");
       for (int i = 0;i<UserList.size();i++){
           System.out.println(UserList.get(i).getUsername());
       }
       //Nº de produtos + total de produtos no carrinho
        System.out.println("Produtos do carrinho de compras:");
       for(int i = 0;i<newProductList2.size();i++){
           System.out.println(newProductList2.get(i).getName());
       }
       System.out.println("Valor dos Produtos");
       System.out.println(list1.GetTotalPriceOnCart()+"Euros");

       //Nº de produtos + total de produtos ainda na lista
        System.out.println(("Produtos que estão ainda na lista:"));
        for (int i = 0;i<newProductList1.size();i++){
            System.out.println((newProductList1.get(i).getName()));
        }
        System.out.println("Valor dos Produtos");
        System.out.println(list1.GetTotalPrice()+"Euros");

        //Percentagem
        System.out.println("Percentage Complete:");
        System.out.println(list1.GetPercentageCompleted());

        //Categorias que existem no carrinho e por categoria o nome dos produtos
        System.out.println("Categorias Carrinho compras");
        for (int i = 0;i<newProductList2.size();i++){
            System.out.println((newProductList2.get(i).getCategoryName()));
        }
        System.out.println(("Nome dos produtos das categorias no carrinho"));
        for (int i = 0;i<newProductList2.size();i++){
            System.out.println((newProductList2.get(i).getName()));
        }

    }
}
