package my.bunin.payment.service;

import my.bunin.payment.PaymentOrderRequest;
import my.bunin.payment.security.Crypt;
import my.bunin.util.JacksonUtils;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public void order(Crypt crypt) {

        PaymentOrderRequest request = JacksonUtils.readValue(crypt.getMessage(), PaymentOrderRequest.class);
        checkRequest(crypt, request);

        // create order

        // execute order





    }

    private void checkRequest(Crypt crypt, PaymentOrderRequest request) {
        if (!crypt.getMerchantNo().equals(request.getMerchantNo())) {
            throw new IllegalArgumentException(String.format(
                    "merchantNo %s is different from merchantNo %s in message!",
                    crypt.getMerchantNo(), request.getMerchantNo()));
        }
    }


}