public class trabajador extends Usuario{
    public trabajador(String nombre,int edad, Mediator mediator,String carnet,String cargo) {
        super(nombre,edad,mediator,carnet,cargo);
    }
    @Override
    public void sendMessage(String msg, String para) {

    }

    @Override
    public void receiveMessage(String msg) {

    }
}
