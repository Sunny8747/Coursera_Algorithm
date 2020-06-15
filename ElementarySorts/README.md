# ElementarySorts and Shuffle

Some elementary sorts and shuffle

<hr/>

## 1. Selection sort, Insertion sort, Shell sort

### Selection sort

- Running Time : T(n^2)
- Data Movement : minimal

```c++
    sometype* a = new sometype[size];
    void Selection_Sort(){
        int N = a.length;
        for(int i = 0;i<N;i++){
            int min = i;
            for (int j = i+1; j < N; j++){
                if(less(a[j], a[min])){ min = j; }
            }
            exchange(a, i, min);
        }
    }

    bool less(sometype v, sometype w){
        return v < w ? true:false;
    }

    void exchange(sometype* a, int i, int j){
        sometype swap_buff = a[i];
        a[i] = a[j];
        a[j] = swap_buff;
    }
```

### Insertion sort

- Running Time : T(1/4 n^2)
- Best Case : T(N-1)

```c++
    sometype* a = new sometype[size];
    void Selection_Sort(sometype* a){
        int N = a.length;
        for(int i = 0;i<N;i++){
            for (int j = i; j > 0; j--){
                if(less(a[j], a[j-1])){ exchange(a, j ,j-1); }
                else { break; }
            }
        }
    }

    bool less(sometype v, sometype w){...}
    void exchange(sometype* a, int i, int j){...}
```

### Shell sort

- Running Time : T(n^3/2)
- 3x+1 increments

```c++
    sometype* a = new sometype[size];
    void Selection_Sort(sometype* a){
        int N = a.length;
        int h = 1;
        while(h < N/3) { h = 3 * h + 1; }
        while(h >= 1) {
            for(int i = h; i < N; i++) {
                for(int j = i; j>= h && less(a[j], a[j - h]); j -= h ){
                    exchange(a, j, j - h);
                }
            }
            h = h/3;
        }
    }

    bool less(sometype v, sometype w){...}
    void exchange(sometype* a, int i, int j){...}
```

<hr/>

## 2. shuffling

- knuth shuffle

```c++
    void shuffle(sometype* a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(i + 1);
            exchange(a, i, r);
        }
    }
```

<hr/>
