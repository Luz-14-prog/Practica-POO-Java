public class Empleado {

    String nombre;
    int ht;
    int het;
    double pph;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }

    public int getHet() {
        return het;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }
public double pagoTotal(){
       return (this.ht*this.pph)+(((pph*0.5)+pph)*this.het);
}
public String categoriaSalarial(){
    double total = this.pagoTotal();
    if(total>5000){
        return "ALTO";
    }else if(total<5000 && total>3000){
        return "MEDIO";
    }else{
        return "BAJO";
    }
}
}
