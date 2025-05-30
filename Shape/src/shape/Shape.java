/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class Shape {
    int dim1;
    int dim2;
    
    Shape(int d1,int d2){
        this.dim1 = d1;
        this.dim2 = d2;
        
    }
    Shape(int d1){
        this.dim1 = d1;
        
        
    }
    
    int areaofSquare( ){
        return (dim1*dim1);
        
    }
    int areaofReactangle(){
        return (dim1*dim2);
    }
    public static void main(String[] args) {
       Shape reactangle = new Shape(8,4);
       int  result = reactangle.areaofReactangle();
       System.out.println("The total Area of your reactangle is :"+result);
       Shape square= new Shape(4);
       int resultS= square.areaofSquare();
       System.out.println("The total are of a Square is :"+ resultS);
       
       
       
       
       
       
       
    }
    
}
