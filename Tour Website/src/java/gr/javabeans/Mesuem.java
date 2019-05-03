package gr.javabeans;

import javax.servlet.http.Part;

public class Mesuem {

    private String mesuemName;
    private String mesuemAddress;
    private String price;
    private String location;
    private String telephone;
    private Part image;
    private String imgArray;

    public String getImgArray() {
        return imgArray;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMesuemName() {
        return mesuemName;
    }

    public void setMesuemName(String mesuemName) {
        this.mesuemName = mesuemName;
    }

    public String getMesuemAddress() {
        return mesuemAddress;
    }

    public void setMesuemAddress(String mesuemAddress) {
        this.mesuemAddress = mesuemAddress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
