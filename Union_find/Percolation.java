package Union_find;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
//import edu.princeton.cs.algs4.QuickFindUF;
//import edu.princeton.cs.algs4.StdStats;
//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;

public class Percolation {
    //create n x n grid, all blocked
    // if you want to use Quick_find algorithm then just change it
    //private QuickFindUF quf;
    private final WeightedQuickUnionUF wquf;

    private final int GRID_SIZE, TOP_INDEX, BOTTOM_INDEX;
    private int open_site = 0;
    private boolean [] grid;

    //loc : 1 ~ n^2
    //grid[] : 0 ~ (n^2 + 1)
    //grid[0] : over top
    //grid[n^2 +1] : under bottom

    //constructor
    public Percolation(int n){
        if(n <= 0){
            throw new IllegalArgumentException();
        }
        this.wquf = new WeightedQuickUnionUF(n*n + 2);
        this.grid = new boolean[n*n + 2]; //false: blocked, true: open
        this.GRID_SIZE = n;
        this.TOP_INDEX = 0;
        this.BOTTOM_INDEX = n*n + 1;
    }

    //open the site(row, col) if blocked
    public void open(int row, int col){
        if(row > this.GRID_SIZE || col > this.GRID_SIZE || row <= 0 || col <= 0){
            throw new IllegalArgumentException();
        }
        int loc = (row-1)* this.GRID_SIZE + col;
        if(this.grid[loc] == false){
            open_site++;
            this.grid[loc] = true;
            check_adjacent_isOpen(row, col);
        }
    }
    //check adjacent grid if isOpen then union to origin node
    private void check_adjacent_isOpen(int row, int col){
        int loc = (row-1)* this.GRID_SIZE + col;

        //if first line and last line  'isOpen'  then  'union'  to TOP, BOTTOM  
        if(row == 1){
            this.wquf.union(loc,TOP_INDEX);
        }
        if(row == this.GRID_SIZE){
            this.wquf.union(loc,BOTTOM_INDEX);
        }
        if(row != 1){//upper grid
            if(isOpen(row-1, col) == true){//up is open
                this.wquf.union(loc, (row-2)* this.GRID_SIZE + col);//union
            }
        }
        if(col != this.GRID_SIZE){//right grid
            if(isOpen(row, col+1) == true){
                this.wquf.union(loc, (row-1)* this.GRID_SIZE + col + 1);//union
            }
        }
        if(row != this.GRID_SIZE){//bottom grid
            if(isOpen(row+1, col) == true){
                this.wquf.union(loc, (row)* this.GRID_SIZE + col);//union
            }
        }
        if(col != 1) {//left grid
            if(isOpen(row, col-1) == true){
                this.wquf.union(loc, (row-1)* this.GRID_SIZE + col - 1);//union
            }
        }
    }

    //is the site(row, col) open?
    public boolean isOpen(int row, int col){
        if(row > this.GRID_SIZE || col > this.GRID_SIZE || row <= 0 || col <= 0){
            throw new IllegalArgumentException();
        }
        int loc = (row-1)* this.GRID_SIZE + col;
        return this.grid[loc];
    }

    //is the site(row, col) full?
    public boolean isFull(int row, int col){
        if(row > this.GRID_SIZE || col > this.GRID_SIZE || row <= 0 || col <= 0){
            throw new IllegalArgumentException();
        }
        int loc = (row-1)* this.GRID_SIZE + col;
        if(this.wquf.find(loc) == this.wquf.find(this.TOP_INDEX)){
            return true;
        }
        return false;
    }
    //return the number of open sites
    public int numberOfOpenSites(){
        return this.open_site;
    }
    //does the system percolate?
    public boolean percolates(){
        if(this.wquf.find(this.TOP_INDEX) == this.wquf.find(this.BOTTOM_INDEX)){
            return true;
        }
        return false;
    }
    //test client(optional)
    public static void main(String[] args){
        int rand_row, rand_col;
        //int n = Integer.parseInt(args[0]);
        int n = 10;
        int count = 0;
        Percolation pc = new Percolation(n);
        while(pc.percolates() == false){
            rand_row = StdRandom.uniform(1,n+1);
            rand_col = StdRandom.uniform(1,n+1);
            System.out.printf("%d :: row : %d col : %d\n",count, rand_row, rand_col);
            pc.open(rand_row, rand_col);
            count++;
        }
        System.out.printf("parants of top : %d\n",pc.wquf.find(pc.TOP_INDEX));
        System.out.printf("parants of bottom : %d\n",pc.wquf.find(pc.BOTTOM_INDEX));
    }
}