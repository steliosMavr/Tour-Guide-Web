package gr.javabeans;

import javax.servlet.http.Part;

public class LandMark {

    private String landmarkName;
    
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
    

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }

  

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

}
