Øvelse 4. 

Rækkefølgen af noderne i Post order og pre order traversing. 
post order:
1, 8, 5, 15, 12, 10, 22, 20, 28, 30, 38, 45, 50, 48, 40, 36, 25

pre order: 
25, 20, 10, 5, 1, 8, 12, 15, 22, 36, 30, 28, 40, 38, 48, 45, 50

Internal path length: 
Summen af alle ikke blades dybde i træet

Dybde af ikke blade: 
node 5 = 3
node 12 = 3
node 10 = 2
node 20 = 1
node 48 = 3
node 40 = 2
node 30 = 2
node 36 = 1

Sum:
3 + 3 + 2 + 1 + 3 + 2 + 2 + 1 = 17 


Er det et AVL træ?
    Balance factor = Height(Left subtree) - Height(Right subtree)
    Et AVL træ er defineret ved at en given nodes to subtræer må ikke have en højder forskel > 1 

Hvis man kigger på Node 20, Den har et subtræ med højden 3 og et med en højde på 1, da det er et blad. 
Det vil sige Træet ikke er et AVL træ. 


