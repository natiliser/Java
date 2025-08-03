public class ArithmeticSeries {
    private int numberOfTerms;
    private int firstTerm;
    private int difference;
    private static int arithmeticSeriesCount = 0;

    public ArithmeticSeries(int numberOfTerms, int firstTerm, int difference) {
        this.numberOfTerms = numberOfTerms;
        this.firstTerm = firstTerm;
        this.difference = difference;
        arithmeticSeriesCount++;
    }

    public int getNumberOfTerms() {
        return this.numberOfTerms;
    }

    public void setNumberOfTerms(int numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }

    public int getFirstTerm() {
        return this.firstTerm;
    }

    public void setFirstTerm(int firstTerm) {
        this.firstTerm = firstTerm;
    }

    public int getDifference() {
        return this.difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getArithmeticSeriesCount() {
        return this.arithmeticSeriesCount;
    }

    public void setArithmeticSeriesCount(int arithmeticSeriesCount) {
        this.arithmeticSeriesCount = arithmeticSeriesCount;
    }

    @Override
    public String toString() {
        return "arithmeticSeries{" +
                "numberOfTerms=" + numberOfTerms +
                ", firstTerm=" + firstTerm +
                ", difference=" + difference +
                ", arithmeticSeriesCount=" + arithmeticSeriesCount +
                '}';
    }

    public int amount(){
        int sum=0;
        int temp=this.firstTerm;
        for (int i = 0; i < numberOfTerms; i++) {
            sum += temp;
            temp += this.difference;
        }
        return sum;
    }

    public double average(){
        return (double) amount()/numberOfTerms;
    }

    public int[]getArray(){
        int[]arr=new int[numberOfTerms];
        arr[0]= this.firstTerm;
        for (int i = 1; i < arr.length; i++) {
            arr[i]= (arr[i-1]+difference);
        }
        return arr;
    }

}
