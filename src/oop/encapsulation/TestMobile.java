package oop.encapsulation;

public class TestMobile {

    public static void main(String[] args) {

        Mobile rashMobile=new Mobile();
        System.out.println(rashMobile.mobileBrandName);

        rashMobile.setMobileModelName("11 Max pro");
        System.out.println(rashMobile.getMobileModelName());
        rashMobile.setMobilePrice("1300");
        System.out.println(rashMobile.getMobilePrice());
        rashMobile.setMobileType("5G");
        System.out.println(rashMobile.getMobileType());
        rashMobile.setMobileHasTripleCameras(true);
        System.out.println(rashMobile.isMobileHasTripleCameras());
    }
}
