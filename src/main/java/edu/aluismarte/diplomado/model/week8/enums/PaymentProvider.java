package edu.aluismarte.diplomado.model.week8.enums;

import edu.aluismarte.diplomado.model.week8.PaypalService;
import edu.aluismarte.diplomado.model.week8.ServiceMastercard;
import edu.aluismarte.diplomado.model.week8.ServiceVisa;
import edu.aluismarte.diplomado.model.week8.StripeService;
import edu.aluismarte.diplomado.model.week8.payment.PaymentGateway;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PaymentProvider {
    STRIPE(new StripeService()),
    PAYPAL(new PaypalService()),
    MASTERCARD(new ServiceMastercard()),
    VISA(new ServiceVisa());

    @Getter
    private final PaymentGateway paymentGateway;

}

