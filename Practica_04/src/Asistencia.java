public class Asistencia {
    String nombre;
    double diasasistidos;
    int dias=30;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiasasistidos() {
        return diasasistidos;
    }

    public void setDiasasistidos(double diasasistidos) {
        this.diasasistidos = diasasistidos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double Porcentaje(){
        return (this.diasasistidos*100)/this.dias;
    }
    public String Estado(){
        double asistencia=this.Porcentaje();
        if(asistencia > 75){
            return "APROBADO";
        }else if(asistencia < 75 && asistencia > 50){
            return "CONDICIONAL";
        }else{
            return "DESAPROBADO";
        }
    }

}
