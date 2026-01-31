/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinhh
 */
public class HinhTron {

    private float r ;

    public HinhTron() {
    }

    public HinhTron(float r) {
        this.r = r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float chuVi(){
        return (float) (this.r*2*Math.PI);
    }
    
    public float dienTich(){
        return (float) (this.r*Math.PI);
    }
}
