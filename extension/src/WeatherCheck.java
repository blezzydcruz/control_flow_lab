public class WeatherCheck {

        public static void main(String[] args) {
            int temperature = 22; //current temperature
            boolean currentlyRaining = true; //Is it raining?

            if(temperature >= 20 && currentlyRaining) {
                System.out.println("It's hot and raining! Wear shorts and bring an umbrella");
            } else if(temperature >= 20 && !currentlyRaining) {
                System.out.println("It's hot and not raining! Wear shorts and sunscreen ");
            } else if(temperature < 20 && currentlyRaining) {
                System.out.println("It's cold and raining! Wear a waterproof coat");
            } else {
                System.out.println("It's cold and not raining! Wear a coat");
            }
        }
}
