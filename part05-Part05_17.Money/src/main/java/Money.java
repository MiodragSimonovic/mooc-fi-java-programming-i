
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        }
        if (euros == compared.euros && cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;
        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

}