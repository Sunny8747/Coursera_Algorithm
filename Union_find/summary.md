Analysis Of Algorithms
===========
Mathmatically Analysis
# 1. Quick Find
- Tag : flat, tree, graph, find  
- Defect :  
    > 1. Union too expensive
    > 2. Trees are flat, but too expensive to keep them flat

    > __Running Time__  
    > * Init - N  
    > * Union - N  
    > * Find - 1  

# 2. Quick Union
- Tag : tree, forest, graph, find node
- Defect :  
    > 1. Trees can get tall
    > 2. Find too expensive
    > 3. lazy approach

    > __Running Time__  
    > * Init - N  
    > * Union - N * includes cost of finding roots  
    > * find - N *worst case

# 3. Quick Union Improved
- Weighting : linking root of smaller tree to root of larger tree (height or rank)  

    > __Running Time__  
    > * Init - M  
    > * Union - lg N = ln N + log_10 N  
    > * find - lg N = ln N + log_10 N  

- Path compression : make samll tree bring to up
- QU + path compression = N + M log N
- weighted QU + path compression = N + M lg N

# 4. Application
- Percolation
- Dynamics connectivity
- Equivanlence of finite state automata
- Least common ancestor
- Matlab's bwlabel() in image processing
- Kruskal's minimum spanning tree algorithm

<hr/>

# Assignment#1
- Percolation : Java
- 93/100
- Fail backwash test

