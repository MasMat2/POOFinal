class Directivo extends Empleado {
    private String categoria;

    public Directivo(String nombre, int edad) {
        super(nombre, edad);
    }

    public Directivo(String nombre, int edad, float sueldoBruto) {
        super(nombre, edad, sueldoBruto);
    }

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria) {
        this(nombre, edad, sueldoBruto);
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public float calcularImpuestos() {
        return 0;
    }

    @Override
    public String toString() {
        return "Directivo [categoria=" + categoria + "]";
    }

}