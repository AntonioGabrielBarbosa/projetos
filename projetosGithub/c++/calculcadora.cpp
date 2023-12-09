#include<iostream>
#include "matBasica.cpp"


int main()
{

    using std::cout, std::cin, std::endl;

    bool continuar = true;

    while (continuar)
    {
        char operacao;

        double numero1;

        double numero2;

        cout << "+ : somar numeros" << endl;
        cout << "- : subtrair numeros" << endl;
        cout << "* : multiplicar numeros" << endl;
        cout << "/ : dividir numeros" << endl;
        cout << "0 : sair do programa" << endl;

        cin >> operacao;

        switch (operacao)
        {
        case '+':

            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;
            
            cout << "Resultado: " << somar(numero1, numero2) << endl;

            break;
        
        case '-':
            
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;

            cout << "Resultado: " << diminuir(numero1, numero2) << endl;

            break;
        
        case '*':
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;

            cout << "Resultado: " << multiplicar(numero1, numero2) << endl;

            break;
        
        case '/':
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;
        
            cout << "Resultado: " << dividir(numero1, numero2) << endl;

            break;
        
        case '0':

            cout << "saindo programa..." << endl;

            continuar = false;

            break;

        default:
            break;
        }

    }
    


    return 0;
}