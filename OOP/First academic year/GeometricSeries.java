public class GeometricSeries {
    private int numberOfTerms;
    private int firstTerm;
    private int ratio;
    private static int GeometricSeriesCount = 0;

    public GeometricSeries(int numberOfTerms, int firstTerm, int ratio) {
        this.numberOfTerms = numberOfTerms;
        this.firstTerm = firstTerm;
        this.ratio = ratio;
        GeometricSeriesCount++;
    }

    public int getNumberOfTerms() {
        return numberOfTerms;
    }

    public void setNumberOfTerms(int numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }

    public int getFirstTerm() {
        return firstTerm;
    }

    public void setFirstTerm(int firstTerm) {
        this.firstTerm = firstTerm;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public int getEngineeringSeriesCount() {
        return GeometricSeriesCount;
    }

    public void setEngineeringSeriesCount(int engineeringSeriesCount) {
        GeometricSeriesCount = engineeringSeriesCount;
    }
    @Override
    public String toString() {
        return "EngineeringSeries{" +
                "numberOfTerms=" + numberOfTerms +
                ", firstTerm=" + firstTerm +
                ", ratio=" + ratio +
                ", EngineeringSeriesCount=" + GeometricSeriesCount +
                '}';
    }
    public int amount(){
        int sum=0;
        int temp=this.firstTerm;
        for (int i = 0; i < numberOfTerms; i++) {
            sum += temp;
            temp *= this.ratio;
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
            arr[i]= (arr[i-1] * this.ratio);
        }
        return arr;
    }
}
