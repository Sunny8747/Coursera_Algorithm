package Union_find;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdStats;
//import edu.princeton.cs.algs4.Stopwatch;
//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.QuickFindUF;

public class PercolationStats {
    // perform independent trials on an n-by-n grid
    private final double[] value_threshold;
    private final static double CONFIDENCE_95 = 1.96;
    private double MEAN, STDDEV;
    public PercolationStats(int n, int trials){
        if(n <= 0 || trials <= 0){
            throw new IllegalArgumentException();
        }
        this.value_threshold = new double[trials];
        for(int i = 0; i < trials; i++){
            Percolation pc = new Percolation(n);
            while(pc.percolates() == false){
                pc.open(StdRandom.uniform(1,n+1), StdRandom.uniform(1,n+1));
            }
            this.value_threshold[i] = pc.numberOfOpenSites()/Math.pow(n,2);//n*n Math.pow(n,2) different result n*n -> result value is 0
        }
    }

    // sample mean of percolation threshold
    public double mean(){
        this.MEAN = StdStats.mean(this.value_threshold);
        return this.MEAN;
    }

    // sample standard deviation of percolation threshold
    public double stddev(){
        this.STDDEV = StdStats.stddev(this.value_threshold);
        return this.STDDEV;
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo(){
        return this.MEAN - ((this.CONFIDENCE_95 * this.STDDEV) / Math.sqrt(this.value_threshold.length));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi(){
        return this.MEAN + ((this.CONFIDENCE_95 * this.STDDEV) / Math.sqrt(this.value_threshold.length));
    }

    // test client (see below)
    public static void main(String[] args){
        //Stopwatch sw = new Stopwatch();

        int n = 10;
        int trials = 100000;

        PercolationStats pStats = new PercolationStats(n, trials);
        System.out.printf("mean                    = %f\n", pStats.mean());
        System.out.printf("stddev                  = %f\n", pStats.stddev());
        System.out.printf("95%% confidence interval = [%f, %f]\n", pStats.confidenceLo(), pStats.confidenceHi()); //'%'' have to notice %% else "Format error"

        //System.out.printf("elapsetime : %f", sw.elapsedTime());
    }
}