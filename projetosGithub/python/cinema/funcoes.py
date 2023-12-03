def criação_matriz(FILA, CADEIRA):
    matriz = []
    #criando a matriz com todas as posições falsas
    for i in range(FILA):
        linha = []
        for j in range(CADEIRA):
            linha.append(False)
        matriz.append(linha)
    return matriz


def impressão_matriz(matriz):
    for i in range(len(matriz)):
        print(matriz[i])


def consulta_reserva_cadeira(matriz, fila, cadeira):
    if matriz[fila-1][cadeira-1]:
        return True
    else:
        return False

def reserva_cadeira(matriz, fila, cadeira):
    matriz[fila-1][cadeira-1] = True
    return matriz
