package modificadores;

public class Padre {
    public String public_var;
    private String private_var;
    protected String protected_var;
    String default_var;

    public void setValues() {
        public_var = "public_var";
        private_var = "private_var";
        protected_var = "protected_var";
        default_var = "default_var";
    }

    public String toString() {
        String atributes;
        atributes = String.format("Protected_var %s", protected_var);
        atributes += String.format("\nPrivate_var %s", private_var);
        atributes += String.format("\nPublic_var %s", public_var);
        atributes += String.format("\nDefault_var %s", default_var);
        return atributes;
    }

}