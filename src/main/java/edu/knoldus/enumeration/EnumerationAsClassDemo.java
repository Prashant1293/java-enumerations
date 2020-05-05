package edu.knoldus.enumeration;

enum Rose {
    RED(true), BLACK(false), WHITE(true), PINK(true), BROWN(false);
    
    private final boolean isAvailable;
    int count = 0;
    
    Rose(boolean isAvailable) {
        System.out.println("Instance " + (++count) + " for constant " + this.name() + " created.");
        this.isAvailable = isAvailable;
    }
    
    boolean getRoseAvailability() {
        return isAvailable;
    }
}

public class EnumerationAsClassDemo {
    
    public static void main(String[] args) {
        // Calls the constructor of enum Rose.
        Rose myRose = Rose.WHITE;
        System.out.println("My rose instance has count = " + myRose.count);
        
        System.out.println("**************************");
        
        System.out.println("Availability of all the roses are: ");
        for (Rose rose : Rose.values()) {
            System.out.println("Rose = " + rose + ", availability = " + rose.getRoseAvailability());
        }
        
        System.out.println("**************************");
        
        switch (myRose) {
            case RED:
                System.out.println("Since myRose is instantiated with Rose.White, this won't print.");
                break;
            case WHITE:
                System.out.println("Enumerations can be passed as expressions to switch statement.");
            default:
                System.out.println("That's the basics of enumerations in Java. Let's see business application next.");
        }
    }
}
