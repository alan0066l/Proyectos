/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adela Hernàndez
 */
public class Shirt {
    //atributos de la clase
    public int shirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;
    
    //mètodo de la clase
    public void displayShirtInformation(){
        
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Shirt Price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
