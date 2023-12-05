public class Reuniao extends Compromisso {
    private String participantes;

    public Reuniao(String data, String hora, String descricao, String participantes) {
        super(data, hora, descricao);
        this.participantes = participantes;
    }

   

    public String getParticipantes() {
        return participantes;
    }
}