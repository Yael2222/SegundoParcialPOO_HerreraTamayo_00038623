public interface Mediator {
    public void add(Usuario u);

    public void notify(String msg, String para, String de);
}
