public abstract class Card {
    private int power;

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void use(){
        if (this.power<0 | this.power>2){
            System.err.println("Valeur de power impossible : "+ this.power);
            return;
        }
    }
}
