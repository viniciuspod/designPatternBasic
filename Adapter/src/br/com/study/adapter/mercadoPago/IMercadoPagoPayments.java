package br.com.study.adapter.mercadoPago;

import br.com.study.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();
    void MercadoPayment();
    void MercadoReceive();
}
