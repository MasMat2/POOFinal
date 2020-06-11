class Empleado extends Persona implements Impuestos {
    private float sueldoBruto;
    
    public Empleado(String nombre, int edad) {
    	super(nombre, edad);
    }
    public Empleado(String nombre, int edad,float sueldoBruto) {
    	this(nombre, edad);
		setSueldoBruto(sueldoBruto);
	}

	public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public float calcularImpuestos() {
        return 0;
    }

	@Override
	public String toString() {
		return "Empleado [sueldoBruto=" + sueldoBruto + "]";
	}
    
}