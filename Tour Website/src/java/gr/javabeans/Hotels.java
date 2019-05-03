package gr.javabeans;

import javax.servlet.http.Part;

public class Hotels {

    private int id;
    private String initialPrice;
    private String price;
    private String name;
    private String address;
    private String category;
    private String telephone;
    private String number;
    private String roomCategory;
    private String area;
    private Part image;
    private String imgArray;
    private String monoklina;
    private String diklina;
    private String perigrafi;

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }
    
    

    public String getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(String initialPrice) {
        this.initialPrice = initialPrice;
    }

    public String getMonoklina() {
        return monoklina;
    }

    public void setMonoklina(String monoklina) {
        this.monoklina = monoklina;
    }

    public String getDiklina() {
        return diklina;
    }

    public void setDiklina(String diklina) {
        this.diklina = diklina;
    }

    public String getImgArray() {
        return imgArray;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setImgArray(String imgArray) {
        this.imgArray = imgArray;
    }

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

    public Hotels() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
