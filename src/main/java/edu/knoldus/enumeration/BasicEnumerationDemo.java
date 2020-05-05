package edu.knoldus.enumeration;

enum BoardMaterial {WHITE, BLACK, SHEET}

enum BoardMaterial2 {BLACK}

public class BasicEnumerationDemo {
    
    public static void main(String[] args) {
        // create an instance of BoardMaterial enum and assign a value to it.
        BoardMaterial material = BoardMaterial.BLACK;
        System.out.println(material);
        System.out.println("*************************************");
        
        // use the values() method to traverse over the objects/constants in the BoardMaterial enum.
        BoardMaterial[] boardMaterials = BoardMaterial.values();
        for (BoardMaterial bm : boardMaterials) {
            System.out.println("Material ordinal = " + bm.ordinal() + ", material = " + bm);
        }
        System.out.println("*************************************");
        
        // use the valueOf() method to get value of constant in the BoardMaterial enum.
        BoardMaterial boardMaterial;
        try {
            boardMaterial = BoardMaterial.valueOf("IncorrectSHEET");
        } catch (IllegalArgumentException e) {
            System.out.println("valueOf() throws an IAE when the string provided, does not match any defined constant in"
                    + " the enum.");
            boardMaterial = BoardMaterial.valueOf("SHEET");
        }
        System.out.println(boardMaterial.name());
        System.out.println("*************************************");
        
        // compare the enums using ==, compareTo() and equals() method.
        compareUsingDoubleEquals();
        System.out.println("*************************************");
        compareUsingCompareTo();
        System.out.println("*************************************");
        compareUsingEquals();
        System.out.println("*************************************");
    }
    
    private static void compareUsingDoubleEquals() {
        BoardMaterial bm1 = BoardMaterial.SHEET;
        BoardMaterial bm2 = BoardMaterial.BLACK;
        BoardMaterial bm3 = BoardMaterial.BLACK;
        BoardMaterial2 bm4 = BoardMaterial2.BLACK;
        
        if (bm1 == bm2) {
            System.out.println("Failure in enum, Sheet value cannot be equal to Black.");
        } else if (bm2 == bm3) {
            System.out.println("An enum value is equal to the enum value of itself only.");
        }
        
        // compilation error, we cannot compare values of two different enums using ==.
        // if (bm3==bm4){}
    }
    
    private static void compareUsingCompareTo() {
        BoardMaterial bm1 = BoardMaterial.SHEET;
        BoardMaterial bm2 = BoardMaterial.BLACK;
        BoardMaterial bm3 = BoardMaterial.BLACK;
        BoardMaterial bm4 = BoardMaterial.WHITE;
        BoardMaterial2 bm5 = BoardMaterial2.BLACK;
        
        System.out.println("Comparing bm1 with bm2, we get = " + bm1.compareTo(bm2));
        System.out.println("Comparing bm2 with bm3, we get = " + bm2.compareTo(bm3));
        System.out.println("Comparing bm1 with bm4, we get = " + bm1.compareTo(bm4));
        // enumeration instance only of the same type can be compared using compareTo().
        // System.out.println("Cannot compare bm1 with bm5, this results in a compilation error. "+ bm1.compareTo(bm5));
    }
    
    private static void compareUsingEquals() {
        BoardMaterial bm1 = BoardMaterial.SHEET;
        BoardMaterial bm2 = BoardMaterial.BLACK;
        BoardMaterial bm3 = BoardMaterial.BLACK;
        BoardMaterial2 bm4 = BoardMaterial2.BLACK;
        
        if (bm1.equals(bm2)) {
            System.out.println("Failure in enum when using equals(), different objects can't be equal.");
        } else if (bm2.equals(bm3)) {
            System.out.println("When using equals(),only same objects can be equal.");
        }
        if (bm1.equals(bm4) || bm2.equals(bm4)) {
            System.out.println("Here we can use to compare two objects of different types but this won't get executed.");
        }
    }
}
