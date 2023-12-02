#include<iostream>
#include "matBasica.cpp"


int main()
{

    using std::cout, std::cin, std::endl;

    while (true)
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
            
            somar(numero1, numero2);

            break;
        
        case '-':
            
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;

            diminuir(numero1, numero2);

            break;
        
        case '*':
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;

            multiplicar(numero1, numero2);

            break;
        
        case '/':
            cout << "Numero1: " << endl;
            cin >> numero1;

            cout << "Numero2: " << endl;
            cin >> numero2;
        
            dividir(numero1, numero2);

            break;
        
        case '0':

            cout << "saindo programa..." << endl;

            break;

        default:
            break;
        }

    }
    


    return 0;
}