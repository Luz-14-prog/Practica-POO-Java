import java.time.LocalDate;

public class Vehiculo {

    String marca;
    String modelo;
    int fabricacion;
    int velocidad;
    int year= LocalDate.now().getYear();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
public int EdadAuto(){
    return (this.year-this.fabricacion);
}
public String Edad(){
        int edad=this.EdadAuto();
        if(edad>10){
            return "Antiguo";
        }else if(edad<10 && edad>3){
            return "Semi-Nuevo";
        }else{
            return "Nuevo";
        }
}
}
