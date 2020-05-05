package edu.knoldus.enumeration;

enum Rose {
    RED(true), BLACK(false), WHITE(true), PINK(true), BROWN(false);
    
    private final boolean isAvailable;
    int count = 0;
    
    Rose(boolean isAvailable) {
        System.out.println("Object " + (++count) + " created.");
        this.isAvailable = isAvailable;
    }
    
    boolean getRoseAvailability() {
        return isAvailable;
    }
}

public class EnumerationAsClassDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Availability of all the roses are: ");
        for (Rose rose : Rose.values()) {
            System.out.println("Rose = " + rose + ", availability = " + rose.getRoseAvailability());
        }
        
        Rose myRose = Rose.WHITE;
        
        System.out.println("My rose instance has count = " + myRose.count);
    }
}
