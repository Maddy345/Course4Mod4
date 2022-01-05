import java.time.LocalTime;


public class Main {
    public static void main(String[] args){
        
        //testing purpose only
        
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        
        
        System.out.println(restaurant.getMenu());
        System.out.println(restaurant.isRestaurantOpen());
    }
}
