package br.com.study.adapter.payoneer;

import br.com.study.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
