public class EventoSocial extends Compromisso {
    private String local;

    public EventoSocial(String data, String hora, String descricao, String local) {
        super(data, hora, descricao);
        this.local = local;
    }

   

    public String getLocal() {
        return local;
    }
}