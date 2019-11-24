public class Product {
    private String name;
    private  String deion;
    private String picture;
    private Category category;
    private int price;
    private  String unityType;

    public Product(String name, String deion, String picture, Category category,int price, String unityType){
        this.name = name;
        this.deion = deion;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unityType = unityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeion() {
        return deion;
    }

    public void setDeion(String deion) {
        this.deion = deion;
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
