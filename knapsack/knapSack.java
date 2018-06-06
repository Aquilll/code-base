public class knapSack /*implements Comparator<knapSack>*/ {
    private Double profit;
    private Double weight;
    private Double ratio;

    public knapSack(Double profit, Double weight, Double ratio) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = ratio;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "knapSack{" +
                "profit=" + profit +
                ", weight=" + weight +
                ", ratio=" + ratio +
                '}';
    }

    /*@Override
    public int compare(knapSack o1, knapSack o2) {
        if(o1.getRatio() > o2.getRatio())
            return 1;
        else
            return -1;
    }*/
}
