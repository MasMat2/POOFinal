class Empresa implements Impuestos {
    private String nombre;
    
    public Empresa(String nombre) {
		super();
		setNombre(nombre); 
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public float calcularImpuestos() {
        return 0;
    }

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + "]";
	}
    
}