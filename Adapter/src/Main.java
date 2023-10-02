import br.com.study.adapter.adapters.MercadoPagoAdapter;
import br.com.study.adapter.adapters.PayonnerAdapter;
import br.com.study.adapter.mercadoPago.MercadoPago;
import br.com.study.adapter.payoneer.Payonner;
import br.com.study.adapter.paypal.IPayPalPayments;
import br.com.study.adapter.paypal.PayPal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        IPayPalPayments payments = new PayonnerAdapter(new Payonner());
//        payments.paypalPayment();
//        payments.paypalReceive();

        IPayPalPayments payments = new MercadoPagoAdapter(new MercadoPago());
        payments.paypalPayment();
        payments.paypalReceive();
    }
}