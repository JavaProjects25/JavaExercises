package Strategy;

public interface IPaymentStrategy {
    void pay(int amount); // why int? if it's money, shouldn't it be a double or a float? whatever! that's the design! gotta follow the design! :)
}
