public class Product {
    private String name;
    private  String description;
    private String picture;
    private Category category;
    private int price;
    private  String unityType;
    private String fabricante;

    public Product(String name, String description, String picture, Category category,int price, String unityType,String fabricante){
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unityType = unityType;
        this.fabricante = fabricante;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getDeion() {
        return description;
    }

    public void setDeion(String deion) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCategoryName(){
        return category.getName();
    }
    public String getCategoryColor(){
        return category.getColor();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnityType() {
        return unityType;
    }

    public void setUnityType(String unityType) {
        this.unityType = unityType;
    }
}

