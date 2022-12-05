package ie.atu;

public class Payment {
    long cardNumber;
    String cardDate;
    int cardCCV;

    private String cardType;

    public Payment(){
    }

    public Payment(long cardNumber, String cardDate, int cardCCV){
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCCV = cardCCV;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        String buffer = Long.toString(cardNumber);

        if (buffer.toCharArray().length != 16)
            throw new IllegalArgumentException("Invalid card number.");
        this.cardNumber = cardNumber;

        if(buffer.toCharArray()[0] == '3'){
            this.cardType = "American Express";
        } else if (buffer.toCharArray()[0] == '4') {
            this.cardType = "Visa Card";
        } else if (buffer.toCharArray()[0] == '5') {
            this.cardType = "Mastercard";
        } else if (buffer.toCharArray()[0] == '6') {
            this.cardType = "Discovery Cards";
        } else {
            throw new IllegalArgumentException("Incorrect card digits");
        }
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        String buffer = cardDate;

        if (buffer.toCharArray().length != 5)
            throw new IllegalArgumentException("Invalid card date.");
        this.cardDate = cardDate;
    }

    public int getCardCCV() {
        return cardCCV;
    }

    public void setCardCCV(int cardCCV) {
        String buffer = String.valueOf(cardCCV);

        if (buffer.toCharArray().length != 3)
            throw new IllegalArgumentException("Invalid CCV.");
        this.cardCCV = cardCCV;
    }

    public String getCardType() {
        return cardType;
    }
}

