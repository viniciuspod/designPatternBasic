package br.com.study.adapter.adapters;

import br.com.study.adapter.mercadoPago.MercadoPago;
import br.com.study.adapter.paypal.IPayPalPayments;
import br.com.study.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("utiliznado os metodos do Mercado Pago");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
       this.mercadoPago.MercadoPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.MercadoReceive();
    }
}
