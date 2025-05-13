package inheritancebasic;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class InheritanceBasic {
    
    // Creating a SuperClass;
    static class A {  // Made static
        int i,j;
        
        void showij(){
            System.out.println("i and j: "+ i + " "+ j);
        }
    }
    
    // Create A Subclass by extending class A;
    static class B extends A {  // Made static
        int k;
        
        void showk(){
            System.out.println("k: "+ k);
        }
            
        void sum(){
            System.out.println("i + j + k: "+(i+j+k));
        }
    }
        
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();  // Fixed variable name
             
        // Super class may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of SuperOb:");
        superOb.showij();
        System.out.println();
             
        // The Subclass has access to all public members of its superclass
        subOb.i = 9;
        subOb.j = 10;
        subOb.k = 11;
        System.out.println("Contents of SubOb:");
        subOb.showij();  // Fixed: should be subOb, not superOb
        subOb.showk();
        System.out.println();
             
        System.out.println("Sum of i,j,k in SubOb:");
        subOb.sum();
    }
}