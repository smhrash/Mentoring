package oop.encapsulation;

public class Mobile {

    public String mobileBrandName="Apple Phone";
    private String mobileType;
    private String mobilePrice;
    private String mobileModelName;
    private boolean mobileHasTripleCameras;

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public String getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(String mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public String getMobileModelName() {
        return mobileModelName;
    }

    public void setMobileModelName(String mobileModelName) {
        this.mobileModelName = mobileModelName;
    }

    public boolean isMobileHasTripleCameras() {
        return mobileHasTripleCameras;
    }

    public void setMobileHasTripleCameras(boolean mobileHasTripleCameras) {
        this.mobileHasTripleCameras = mobileHasTripleCameras;
    }
}

