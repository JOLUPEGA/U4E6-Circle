
package Circle;

public class Circle {
    private Double area;
    private Double radio;
    private Double diametro;
    private Double pi;
    
    public Circle(){
        this.pi = 3.14;
        this.radio = 1.0;
    }
    public Double circleArea(Double radio){
        this.radio = radio;
        this.diametro = 2*(this.radio);
        this.area = this.pi*(this.radio*this.radio);
        return this.area;
    }
    
    public void setRadio(Double radio){
        this.radio= radio;
    }

    public Double getradio(){
        return this.radio;
    }
}
