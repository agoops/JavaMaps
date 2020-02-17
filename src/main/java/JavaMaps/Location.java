package JavaMaps;

public class Location {

    // 2 private fields, `city` and `state`
    private String city;
    private String state;

    // A constructor taking no arguments
    public Location() {
        this.city = "Seattle";
        this.state = "WA";
    }

    // A constructor taking 2 arguments
    public Location(String cityArg, String stateArg) {
        this.city = cityArg;
        this.state = stateArg;
    }

    // An instance method. Prints the city and state of this instance
    public void printInfo() {
        System.out.println(this.city + ", " + this.state);
    }
}