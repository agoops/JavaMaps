/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaMaps;

public class App {

    public static void main(String[] args) {
        // Use the no-argument constructor to create an instance of the Location
        // class
        Location myDefaultLocation = new Location();

        System.out.println("Calling myDefaultLocation.printInfo()");
        myDefaultLocation.printInfo(); // Should print "Seattle, WA"

        // Use the constructor taking 2 arguments to initialize anoter instance of
        // Location
        Location myOtherLocation = new Location("Tacoma", "WA");

        System.out.println("Calling myOtherLocation.printInfo()");
        myOtherLocation.printInfo(); // Should print "Tacoma, WA"
    }
}