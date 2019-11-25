public class Address {
    public String streetname;
    public int doorno;
    private String postalcode;

    public Address(String streetname,int doorno,String postalcode){
        this.streetname = streetname;
        this.doorno = doorno;
        this.postalcode = postalcode;
    }

    public String getStreetname() {
        return streetname;
    }

    public int getDoorno() {
        return doorno;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}
