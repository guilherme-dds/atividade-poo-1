package atividade;

public class Principal {
    public static void main(String[] args){
        Notificacao not = new Notificacao("Primeiro exemplo");

        NotificacaoSMS sms = new NotificacaoSMS("Segundo exemplo");

        not.enviar();
        sms.enviar();
    }
}