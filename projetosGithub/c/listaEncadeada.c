#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include"listaEncadeada.h"

typedef struct lista
{
    /* data */
    int info;
    struct lista* prox;

}listaEncadeada;

//criacao da lista

//inserção no inicio: retorna a lista atualizada

listaEncadeada* criarLista(void)
{
    return NULL;
}

listaEncadeada* inserirElemento(listaEncadeada* l, int i)
{

    listaEncadeada* novo = (listaEncadeada*) malloc(sizeof(listaEncadeada));
    if(novo == NULL)
    {
        printf("Memoria nao foi alocada.\n");
        exit(1);
    }
    novo->info = i;
    novo->prox = l;

    return novo;

}

void imprimirLista(listaEncadeada* l){
    listaEncadeada* p;

    for (p = l; p != NULL; p = p->prox)
    {
        printf("\ninfo= %d\n", p->info);
    }
    
}

bool lst_vazia(listaEncadeada* l)
{
    return (l == NULL);
}

listaEncadeada* buscarElemento(listaEncadeada* l, int v)
{
    listaEncadeada* p;

    for( p = l; p != NULL; p = p->prox)
    {
        /* code */
        if (p->info == v)
        return p;
        
    }

    return NULL;
    
}

listaEncadeada* removerElemento(listaEncadeada* l, int v)
{
    listaEncadeada* ant = NULL;
    listaEncadeada* p = l;

    while (p != NULL && p->info != v)
    {
        ant = p;
        p = p->prox;
    }
    if (p == NULL)
        return l;
    if (ant == NULL)
        l = p->prox;
    else
        ant->prox = p->prox;
    free(p);
    return l;
}

void lst_libera(listaEncadeada* l)
{
    listaEncadeada* p = l;
    while (p != NULL)
    {
        listaEncadeada* t = p->prox;
        free(p);
        p = t;
    }
    
}

int main()
{

    listaEncadeada* l;
    listaEncadeada* p;
    l = criarLista();
    l = inserirElemento(l, 10); 
    l = inserirElemento(l, 15); 
    l = inserirElemento(l, 20); 
    l = inserirElemento(l, 25);
    l = inserirElemento(l, 30); 
    imprimirLista(l); 
    p = buscarElemento(l, 15);
    (p)? printf("\nValor encontrado\n") : printf("\nValor nao encontrado\n");
    l = removerElemento(l, 15);
    l = removerElemento(l, 30);
    imprimirLista(l);
    lst_libera(l);
    

    return 0;
}