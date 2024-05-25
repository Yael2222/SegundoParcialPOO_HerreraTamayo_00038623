import java.util.ArrayList;
import java.util.Iterator;
public class UsuarioMediator implements Mediator{
        private ArrayList<Usuario> empleados;

        public UsuarioMediator(){
            empleados = new ArrayList<Usuario>();
        }

        @Override
        public void add(Usuario u) {
            empleados.add(u);
        }

        private Usuario getUsuario(String ID){
            Iterator<Usuario> iter = empleados.iterator();
            Usuario u = null;
            while(iter.hasNext()){
                u = iter.next();
                if(u.getCarnet().equals(ID)){
                    break;
                }
            }
            return u;
        }

        @Override
        public void notify(String msg, String para, String de) {

            String protocolo = String.valueOf(de.charAt(0)) + String.valueOf(de.charAt(0));
            switch (protocolo){
                case "00":
                    System.out.println("Comunicación errónea, solo puede haber un CEO.");
                    break;
                case "01":
                    System.out.println("Mensaje urgente del CEO");
                    getUsuario(para).receiveMessage("del CEO: "+msg);
                    break;
                case "02":
                    System.out.println("Mensaje del jefe");
                    getUsuario(para).receiveMessage("del jefe: "+msg);
                    break;
                case "03":
                    System.out.println("Mensaje del trabajador");
                    getUsuario(para).receiveMessage("del trabajador: "+msg);
                    break;
                case "04":
                    System.out.println("Error: el trabajador no se puede hablar con el CEO");

                    break;

            }
        }
    }


