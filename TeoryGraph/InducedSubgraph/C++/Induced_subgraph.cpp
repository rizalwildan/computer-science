#include <iostream>

using namespace std;

int main () {
    char huruf[4] = {'A','B','C','D'}, input;
    int n = 4, hapus = 0;
    int h[4][4], g[4][4];

    //input Graph H
    cout << "Masukkan Nilai Graph H" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "Masukkan Nilai " << huruf[i] << " " << huruf[j] << " : ";
            cin >> h[i][j];
            g[i][j] = h[i][j];
        }
    }

    //Cetak Graph H
    cout << "Graph H" << endl;
    cout << "-------------------------------------" << endl;
    for (int i = 0; i < n; i++) {
        cout << "\t" << huruf[i];
    }
    cout << endl;
    for (int i = 0; i < n; i++) {
        cout << huruf[i] << "\t";
        for (int j = 0; j < n; j++) {
            cout << h[i][j] << "\t";
        }
        cout << endl;
    }
    cout << "-------------------------------------" << endl;
    cout << endl;

    //Vertex yang mau dihapus
    cout << "Masukkan Vertex yang mau dihapus : " << endl;
    cin >> input;

    for (int i = 0; i < n; i++) {
            if (huruf[i] == input) {
                hapus = i;
           }
    }

    //Proses Menghapus vertex
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == hapus) {
                g[hapus][j] = 0;
            }
            if (j == hapus) {
                g[i][hapus] = 0;
            }
        }
    }

    //Cetak Graph H
    cout << "Graph H" << endl;
    cout << "-------------------------------------" << endl;
    for (int i = 0; i < n; i++) {
        cout << "\t" << huruf[i];
    }
    cout << endl;
    for (int i = 0; i < n; i++) {
        cout << huruf[i] << "\t";
        for (int j = 0; j < n; j++) {
            cout << h[i][j] << "\t";
        }
        cout << endl;
    }
    cout << "-------------------------------------" << endl;
    cout << endl;

    //Cetak Graph G
    cout << "Graph G" << endl;
    cout << "-------------------------------------" << endl;
    for (int i = 0; i < n; i++) {
        if (i == hapus) {
            cout << "\t";
        }
        else {
            cout << "\t" << huruf[i];
        }
    }
    cout << endl;
    for (int i = 0; i < n; i++) {
        if (i == hapus) {
            cout << "\t";
        }
        else {
            cout << huruf[i] << "\t";
        }
        for (int j = 0; j < n; j++) {
            if (g[i][j] == 0) {
                cout << "\t";
            }
            else {
                cout << g[i][j] << "\t";
            }
        }
        cout << endl;
    }
    cout << "-------------------------------------" << endl;
    cout << endl;

}