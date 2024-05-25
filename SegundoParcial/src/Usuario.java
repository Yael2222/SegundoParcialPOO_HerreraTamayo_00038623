public  abstract class Usuario {
    private String nombre;
    private int edad;
    private Mediator mediator;
    private String  carnet;
    private String cargo;

    public Usuario(){}

    public Usuario(String nombre, int edad, Mediator mediator, String carnet, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.mediator = mediator;
        this.carnet = carnet;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator med) {
        this.mediator = med;
    }
    public abstract void sendMessage(String msg, String para);

    public abstract void receiveMessage(String msg);
}
