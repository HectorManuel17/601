
package excepciones9;



public class Persona {
    private String nombre;
    private String apellido;
    private String edad;

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    
    public String getEdad(){
        return edad;
    }
    
    public void setEdad(String edad){
        this.edad = edad;
    }
    
    @Override    
public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("Persona[nombre=");
    builder.append(nombre);
    builder.append(" ,apellido= ");
    builder.append(apellido);
    builder.append(" ,edad= ");
    builder.append(edad);
    builder.append("]");
    return builder.toString();
    
}

    
}
