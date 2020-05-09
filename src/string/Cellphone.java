package string;

public class Cellphone {

    public static void main(String[] args) {

        String brandName= "Apple phone";
        String modelName = "11 Max Pro";
        double price = 1300.00;

        System.out.println("the length of String value is "+brandName.length());
        System.out.println(brandName.concat(String.valueOf(price)));
        System.out.println(brandName.equals("Apple phone"));
        System.out.println(brandName.equals("Apple Phone"));
        System.out.println(brandName.equalsIgnoreCase("Apple Phone"));
        System.out.println(brandName.charAt(7));
        System.out.println(brandName.substring(7));
        //System.out.println(brandName.charAt(12));
        System.out.println("===================================");
        try{
            System.out.println(brandName.charAt(12));
        }
        catch(Exception e){
            System.out.println("String Index Out Of Bound Exception");
        }

    }
}
