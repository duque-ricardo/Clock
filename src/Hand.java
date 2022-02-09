public class Hand {
    private int upperBound;
    private int value;

    public Hand(int upperBound) {
        this.upperBound = upperBound;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= upperBound) {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }
}
