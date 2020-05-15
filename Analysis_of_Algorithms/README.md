Analysis Of Algorithms
===========
Mathmatically Analysis
## 1. Observation
- Tag : flat, tree, graph, find  
- Defect :  
    > 1. Union too expensive
    > 2. Trees are flat, but too expensive to keep them flat

    > __Running Time__  
    > * Init - N  
    > * Union - N  
    > * Find - 1  

<hr/>

## 2. Quick Union
- Tag : tree, forest, graph, find node
- Defect :  
    > 1. Trees can get tall
    > 2. Find too expensive
    > 3. lazy approach

    > __Running Time__  
    > * Init - N  
    > * Union - N * includes cost of finding roots  
    > * find - N *worst case

<hr/>

