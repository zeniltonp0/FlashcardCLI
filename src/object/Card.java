package object;

import java.time.LocalDate;

public class Card {
    private String pergunta, resposta;
    private int NumVezesRespon;
    private LocalDate revisao;

    private Feedback feedback;
    public Card(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
        NumVezesRespon = 0;
        this.revisao = LocalDate.now();
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getNumVezesRespon() {
        return NumVezesRespon;
    }

    public void setNumVezesRespon(int numVezesRespon) {
        NumVezesRespon = numVezesRespon;
    }

    public LocalDate revisaoEspacada(Feedback feedback){
        switch(feedback){
            case HARD:
                revisao = revisao.plusDays(1);
                break;
            case GOOD:
                revisao = revisao.plusWeeks(1);
                break;
            case EASY:
                revisao = revisao.plusMonths(1);
        }
        return revisao;
    }
}
