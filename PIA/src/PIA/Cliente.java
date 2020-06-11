
class Cliente extends Persona implements Impuestos {
    private String nombreEmpresa;
    private String telefono;

    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }

    public Cliente(String nombre, int edad, String nombreEmpresa, String telefono) {
        this(nombre, edad);
        setNombreEmpresa(nombreEmpresa);
        setTelefono(telefono);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public float calcularImpuestos() {
        return 0;
    }

    @Override
    public String toString() {
        return "Cliente [nombreEmpresa=" + nombreEmpresa + ", telefono=" + telefono + "]";
    }
}