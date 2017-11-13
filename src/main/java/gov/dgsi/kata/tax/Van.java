package gov.dgsi.kata.tax;

public class Van {
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int computeTax() {
        if(this.weight >= 3500){
            return 190;
        }
        return 165;
    }
}
