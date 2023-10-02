package br.com.study.adapter.payoneer;

import br.com.study.adapter.utils.Token;

public class Payonner implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via payonner");
    }

    @Override
    public void receivePayment() {
        System.out.println("recebendo pagamentos via Payonner");
    }
}
