package br.com.study.adapter.mercadoPago;

import br.com.study.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void MercadoPayment() {
        System.out.println("enviando pagamento via Mercado Pago");
    }

    @Override
    public void MercadoReceive() {
        System.out.println("recebendo pagamento via mercado pago");
    }
}
