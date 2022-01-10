package com.csk.msscssm.service;

import com.csk.msscssm.domain.Payment;
import com.csk.msscssm.domain.PaymentEvent;
import com.csk.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    String PAYMENT_ID_HEADER = "payment_id";

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
