package modificadores;

public class Hijo extends Padre {
    private String var;

    public Hijo(String var) {
        setVar(var);
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getVar() {
        return this.var;
    }

    public String getValues(Padre padre) {
        String atributes;
        atributes = String.format("Protected_var %s", padre.protected_var);
        // atributes += String.format("\nPrivate_var %s", padre.private_var);
        atributes += String.format("\nPublic_var %s", padre.public_var);
        atributes += String.format("\nDefault_var %s", padre.default_var);
        return atributes;

    }
}