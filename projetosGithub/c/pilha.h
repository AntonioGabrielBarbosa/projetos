#ifndef PILHA_H
#define PILHA_H

#define N 50

typedef struct Pilha
{
    int topo;
    float vet[N];
} Pilha;

Pilha* pilha_cria();
void pilha_push(Pilha* p, float v);
int pilha_vazia(Pilha* p);
float pilha_pop(Pilha* p);
void pilha_libera(Pilha* p);
void pilha_imprime(Pilha* p);

#endif
