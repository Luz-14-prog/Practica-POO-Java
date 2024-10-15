public class CuentaBancaria {

    String nombre;
    String TipoCuenta;
    double salini;
    double monto;
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        TipoCuenta = tipoCuenta;
    }

    public double getSalini() {
        return salini;
    }

    public void setSalini(double salini) {
        this.salini = salini;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double Depo() {
        this.saldo = this.salini + this.monto;
        return this.saldo;
    }

    public double Reti() {
        this.saldo = this.salini - this.monto;
        return this.saldo;
    }
    public String Estado(){
        if(this.saldo>1000){
            return "Suficiente";
        }else if(this.saldo<1000 && this.saldo>100){
            return "Minimo";
        }else{
            return "Critico";
        }
        }
        public String EstadoIni(){
            if(this.salini>1000){
                return "Suficiente";
            }else if(this.salini<1000 && this.salini>100){
                return "Minimo";
            }else{
                return "Critico";
            }
    }
}
