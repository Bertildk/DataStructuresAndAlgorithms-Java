Øvelse 5.

Minimum spanning tree for grafen:
    Svaret skal være en liste af edges/kanter, der viser i
    hvilken rækkefølge algoritmen vil etablere forbindelser mellem noderne
Kruskal Algorithm
Fremgangsmåde: List alle edges samt vægt
Sorter alle edges ift vægt

0 - 1: 1
0 - 2: 6
0 - 4: 1
0 - 5: 2

1 - 2: 8

2 - 5: 3 
2 - 3: 14

3 - 6: 1
3 - 7: 1

4 - 8: 7

5 - 6: 20
5 - 8: 3
5 - 9: 5
5 - 10: 8

6 - 7: 4
6 - 11: 8

7 - 11: 3

8 - 9: 4

9 - 10: 2

10 - 11: 5

Sorterede Edges:
0 - 1 : 1
0 - 4 : 1
3 - 6 : 1
3 - 7 : 1
9 - 10 : 2
0 - 5 : 2
2 - 5 : 3
5 - 8 : 3
7 - 11 : 3
6 - 7 : 4
8 - 9 : 4
5 - 9 : 5
10 - 11 : 5
0 - 2 : 6
4 - 8 : 7
1 - 2 : 8
5 - 10 : 8
2 - 3 : 14
5 - 6 : 20
6 - 11 : 8

Minimum spanning tree:

0 - 1 : 1
0 - 4 : 1
3 - 6 : 1
3 - 7 : 1
9 - 10 : 2
0 - 5 : 2
2 - 5 : 3
5 - 8 : 3
7 - 11 : 3
8 - 9: 4
10 - 11: 5

Visualisering:
![alt text](image.png)


Træets totale vægt: 26
Hvilken algoritme der blev brugt: Kruskal


