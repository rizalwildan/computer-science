#include <iostream>
#include <cmath>
#include <ctgmath>

using namespace std;

double x, x2, x3;
double hasil, hasil2, hasil3;
char pilihan;

double pertama () {
        x = 0;
        int i = 0;
        cout << "\n---------------------------------------------------------" << endl;
        while (i !=10) {
            if (hasil < 0) {
                break;
            }
            else {
                hasil = exp(-x) - x;
                cout << x << "\t";
                cout << hasil << endl;
                x = x + 0.1;
                
                i++;
            }
        
        }
        x = x - 0.2;
        hasil = exp(-x) - x;
        x2 = x;
        cout << "---------------------------------------------------------" << endl;
}

double kedua () {

        int i = 0;

        cout << "\n---------------------------------------------------------" << endl;
        while (i !=10) {
            if (hasil2 < 0) {
                break;
            }
            else {
                hasil2 = exp(-x2) - x2;
                cout << x2 << "\t";
                cout << hasil2 << endl;
                x2 = x2 + 0.01;
                
                i++;
            }
        }
        x2 = x2 - 0.02;
        hasil2 = exp(-x2) - x2;
        x3 = x2;
        cout << "---------------------------------------------------------" << endl;
}

double ketiga () {

        int i = 0;

        cout << "\n---------------------------------------------------------" << endl;
        while (i !=10) {
            if (hasil3 < 0) {
                break;
            }
            else {
                hasil3 = exp(-x3) - x3;
                cout << x3 << "\t";
                cout << hasil3 << endl;
                x3 = x3 + 0.001;
                
                i++;
            }
        }
        x3 = x3 - 0.002;
        hasil3 = exp(-x3) - x3;
        cout << "---------------------------------------------------------" << endl;
}


int main () {

    do {
        cout << pertama ();
        cout << kedua ();
        cout << ketiga ();

        cout << endl;

        cout << x << "\t" << hasil << "\t" << x2 << "\t" << hasil2 << "\t" << x3 << "\t" << hasil3 << endl;

        cout << "Apakah Anda Mau mengulang (y/n) : "; cin >> pilihan;
    }

    while (pilihan == 'y');

}