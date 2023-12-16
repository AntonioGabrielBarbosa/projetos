#include<stdio.h>
#include<stdlib.h>
#define N 50

typedef struct
{
    int topo;
    float vet[N];
}Pilha;

Pilha* pilha_cria()
{
    Pilha* p = (Pilha*)malloc(sizeof(Pilha));

    p->topo = 0; /*incializa com zero elementos*/

    return p;
}

void pilha_push(Pilha* p, float v)
{
    if (p->topo == N)
    {
        printf("Capacidade da pilha estourou.\n");
        exit(1);
    }

    p->vet[p->topo] = v;

    p->topo++;
    
}

int pilha_vazia(Pilha* p)
{
    return (p->topo == 0);
}

float pilha_pop(Pilha* p)
{
    float v;
    if (pilha_vazia(p))
    {
        printf("Pilha vazia.\n");
        exit(1);
    }

    v = p->vet[p->topo - 1];
    p->topo--;
    return v;
}

void pilha_libera(Pilha* p)
{
    free(p);
}

void pilha_imprime(Pilha* p)
{
    int i;

    for ( i = p->topo - 1; i >=0 ; i--)
    {
        /* code */
        printf("%f\n", p->vet[i]);
    }
    
}

int main()
{
    /* cria nova pilha */
    Pilha* p = pilha_cria();

    /* coloca elementos na pilha */
    pilha_push(p, 1.0);
    pilha_push(p, 2.0);
    pilha_push(p, 3.0);

    /* imprime a pilha */
    pilha_imprime(p);

    /* remove um valor da pilha */
    float v = pilha_pop(p);
    printf("Valor removido: %f\n", v);

    /* checa valor da pilha */
    if (pilha_vazia(p))
        printf("a pilha esta vazia.\n");
    else
        printf("a pilha nao esta vazia.\n");

    /* livra a memoria */
    pilha_libera(p);

    return 0;
}