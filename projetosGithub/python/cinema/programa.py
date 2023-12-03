import funcoes

FILAS = 25
CADEIRAS = 40
lugares = funcoes.criação_matriz(FILAS, CADEIRAS)
funcoes.impressão_matriz(lugares)
entrada = ''
while True:
    try:
        while True:
            reserva_fila = int(input('Fila: '))
            assert 1 <= reserva_fila <= FILAS
            reserva_cadeira = int(input('Cadeira: '))
            assert 1 <= reserva_cadeira <= CADEIRAS

            if funcoes.consulta_reserva_cadeira(lugares, reserva_fila, reserva_cadeira):
                print('Essa cadeira já está reservada!')
            else:
                lugares = funcoes.reserva_cadeira(lugares, reserva_fila, reserva_cadeira)
                print(f'Cadeira [{reserva_fila}][{reserva_cadeira}] reservada!')

            entrada = input('Nova reserva? [S/N] ')
            if entrada == 'N':
                break

    except AssertionError:
        print('Informação inválida')

    if entrada == 'N':
        break

funcoes.impressão_matriz(lugares)