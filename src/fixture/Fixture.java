/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixture;

/**
 *
 * @author Tyler
 */
public class Fixture {
    private String material;
    
    public void activate()
    {
        System.out.println("Activated");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
