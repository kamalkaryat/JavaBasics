package design_patterns;

public class Factory {
    public static void main(String[] args) {
        Payment payment= PaymentFactory.getPayment("UPI");
        if(payment != null)
            payment.pay();
    }
}

interface Payment{
    void pay();
}

class PaymentFactory{
    public static Payment getPayment(String type){
        if(type.equals("UPI")) return new UPIPayment();
        else if(type.equals("Card")) return new CardPayment();
        return null;
    }
}

class CardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying Using Card");
    }
}

class UPIPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying Using UPI");
    }
}