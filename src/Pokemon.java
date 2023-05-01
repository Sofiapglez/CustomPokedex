public class Pokemon {
    private String nombre;
    private String tipo;
    private double altura;
    private double peso;
    private String descripcion;

    public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String msg = "";
        if (nombre!=null) {
            msg = nombre;
        } else {
            msg += "??";
        }

        msg += "\n";
        if (tipo!=null) {
            msg += tipo;
        } else {
            msg += "??";
        }

        msg += "\nHT ";
        if (altura!= 0) {
            msg += altura;
        } else {
            msg += "??";
        }

        msg += "\nWT ";
        if (peso!= 0) {
            msg += peso + " lb";
        } else {
            msg += "??";
        }

        msg += "\n";
        if (descripcion!= null) {
            msg += "-----------------------------\n" + descripcion;
        } else {
            msg += "??";
        }

        return msg;
    }
}
