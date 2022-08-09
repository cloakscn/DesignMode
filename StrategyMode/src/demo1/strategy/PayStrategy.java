package demo1.strategy;

/**
 * @author cloaks
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
