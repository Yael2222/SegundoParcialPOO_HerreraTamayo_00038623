public class CEO extends Usuario {
    public CEO(String nombre,int edad, Mediator mediator,String carnet,String cargo) {
        super(nombre,edad,mediator,carnet,cargo);
    }

    @Override
    public void sendMessage(String msg, String para) {
        getMediator().notify(msg, para, getCarnet());
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("CEO: Mensaje recibido "+msg);
    }
}
