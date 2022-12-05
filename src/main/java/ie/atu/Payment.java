package ie.atu;

public class Payment {
String cardNumber;
String cardDate;
String cardCCV;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 12)
            throw new IllegalArgumentException("Invalid card number.");
        this.cardNumber = cardNumber;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        if (cardDate.length() != 5)
            throw new IllegalArgumentException("Invalid card date.");
        this.cardDate = cardDate;
    }

    public String getCardCCV() {
        return cardCCV;
    }

    public void setCardCCV(String cardCCV) {
        if (cardCCV.length() != 3)
            throw new IllegalArgumentException("Invalid CCV.");
        this.cardCCV = cardCCV;
    }
}


