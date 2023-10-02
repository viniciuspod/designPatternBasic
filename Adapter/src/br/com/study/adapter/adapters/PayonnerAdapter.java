package br.com.study.adapter.adapters;

import br.com.study.adapter.payoneer.Payonner;
import br.com.study.adapter.paypal.IPayPalPayments;
import br.com.study.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {
    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("adaptando o Payonner utilizando os metodos");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
