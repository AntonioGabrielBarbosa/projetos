#ifndef LISTAENCADEADA_H
#define LISTAENCADEADA_H

typedef struct listaEncadeada
{
    int dado;
    struct listaEncadeada* prox;

} listaEncadeada;

listaEncadeada* criarLista(void);
listaEncadeada* inserirElemento(listaEncadeada* l, int i);
void imprimirLista(listaEncadeada* l);
bool lst_vazia(listaEncadeada* l);
listaEncadeada* buscarElemento(listaEncadeada* l, int v);
listaEncadeada* removerElemento(listaEncadeada* l, int v);
void lst_libera(listaEncadeada* l);


#endif