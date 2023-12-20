#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct lista
{
    /* data */
    int info;
    struct lista* prox;

}ListaEncadeada;

//criacao da lista

//inserção no inicio: retorna a lista atualizada

ListaEncadeada* criarLista(void)
{
    return NULL;
}

ListaEncadeada* inserirElemento(ListaEncadeada* l, int i)
{

    ListaEncadeada* novo = (ListaEncadeada*) malloc(sizeof(ListaEncadeada));
    if(novo == NULL)
    {
        printf("Memoria nao foi alocada.\n");
        exit(1);
    }
    novo->info = i;
    novo->prox = l;

    return novo;

}

void imprimirLista(ListaEncadeada* l){
    ListaEncadeada* p;

    for (p = l; p != NULL; p = p->prox)
    {
        printf("\ninfo= %d\n", p->info);
    }
    
}

bool lst_vazia(ListaEncadeada* l)
{
    return (l == NULL);
}

ListaEncadeada* buscarElemento(ListaEncadeada* l, int v)
{
    ListaEncadeada* p;

    for( p = l; p != NULL; p = p->prox)
    {
        /* code */
        if (p->info == v)
        return p;
        
    }

    return NULL;
    
}

ListaEncadeada* removerElemento(ListaEncadeada* l, int v)
{
    ListaEncadeada* ant = NULL;
    ListaEncadeada* p = l;

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

void lst_libera(ListaEncadeada* l)
{
    ListaEncadeada* p = l;
    while (p != NULL)
    {
        ListaEncadeada* t = p->prox;
        free(p);
        p = t;
    }
    
}

int main()
{

    ListaEncadeada* l;
    ListaEncadeada* p;
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