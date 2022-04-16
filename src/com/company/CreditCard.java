package com.company;

public class CreditCard {
    String cardNumber;
    String owner;
    String type;

    void info() {
        switch (type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Ув. " + owner + " поздравляем, вы используете нормальную карту");
                break;
            case "МИР":
                System.out.println(owner + " пошел ты на х#й вместе со своим русским кораблем!!");
                break;
            default:
                System.out.println("Неизвестный тип карты " + type);
        }
    }

    public static void main(String[] args) {
        CreditCard Card = new CreditCard();
        Card.cardNumber = "12345";
        Card.owner = "Zelensky";
        Card.type = "VISA";
        Card.info();

        CreditCard Card2 = new CreditCard();
        Card2.cardNumber = "54321";
        Card2.owner = "Arestovich";
        Card2.type = "MASTERCARD";
        Card2.info();

        CreditCard Card3 = new CreditCard();
        Card3.cardNumber = "00000";
        Card3.owner = "putin huilo";
        Card3.type = "МИР";
        Card3.info();

        CreditCard Card4 = new CreditCard();
        Card4.cardNumber = "default";
        Card4.owner = "default";
        Card4.type = "default";
        Card4.info();
    }
}


