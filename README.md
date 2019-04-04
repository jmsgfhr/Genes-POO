# Genes-POO
Trabalho de POO

Um algoritmo genético é uma técnica de inteligência artificial que se inspira na
forma como a natureza funciona e na teoria da evolução para resolver problemas
complexos.
Os algoritmos genéticos funcionam mantendo uma população de estruturas que
evoluem de forma semelhante à evolução das espécies. A recombinação e a
mutação são os operadores básicos de um algoritmo genético.
Considerando que os indivíduos da população são codificados através de strings, o
operador de recombinação recebe duas strings S1 e S2, sorteia aleatoriamente um
ponto de corte em S1 e S2. Em seguida, realizada a troca de informações genéticas
de S1 e S2, de forma a gerar dois novos indivíduos filhos.

O operador de mutação consiste em sortear aleatoriamente uma posição em um dos
indivíduos filhos, e então modificar aleatoriamente o conteúdo daquela posição.

–A função recombinacao recebe como parâmetro 4 Strings (S1, S2, S3 e S4), onde S1 e S2 são as Strings
representado os indivíduos pais e S3 e S4 devem retornar os dois indivíduos filhos gerados com a
recombinação de S1 e S2. Ambas as strings devem possuir o mesmo tamanho.

–A função mutacao recebe como parâmetro uma string S1 e modifica o conteúdo de S1 realizando o
processo de mutação. O seu programa deve ler duas strings S1 e S2 (de mesmo tamanho), fazer a
recombinação dos dois indivíduos e aplicar uma mutação em um dos indivíduos resultantes.
