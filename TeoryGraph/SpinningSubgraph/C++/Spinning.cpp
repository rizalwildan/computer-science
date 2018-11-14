#include <iostream>
#include <cstring>

using namespace std;

    

int main () {
    int g[4][4] = {{0,1,1,0}, {0,0,0,1}, {0,0,1,0}, {0,1,1,0}};
    int h[4][4];
    char huruf[4] = {'A','B','C','D'};
    int n = 4;
    bool cek;

    //input Graph H
    cout << "Masukkan Nilai Graph H" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "Masukkan Nilai " << huruf[i] << " " << huruf[j] << " : ";
            cin >> h[i][j];
        }
    }
    cout << endl;

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
        cout << "\t" << huruf[i];
    }
    cout << endl;
    for (int i = 0; i < n; i++) {
        cout << huruf[i] << "\t";
        for (int j = 0; j < n; j++) {
            cout << g[i][j] << "\t";
        }
        cout << endl;
    }
    cout << "-------------------------------------" << endl;
    cout << endl;

    cek = true;

    //Pengujian Graph G adalah subgrap Graph H
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (h[i][j] == 1 && h[i][j] != g[i][j]) {
                cek = false;
            }
        }
    }

    //Hasil Pengujian
    if (cek == true) {
        cout << "Graph G Merupakan Subgraph Graph H" << endl;
    }
    else {
        cout << "Graph G bukan merupakan Subgraph Graph H" << endl;
    }
}

    // cout << "-------------------------------------" << endl;
    // for (int i = 0; i < n; i++) {
    //     cout << "\t" << huruf[i];
    // }
    // cout << endl;
    // for (int i = 0; i < n; i++) {
    //     cout << huruf[i] << "\t";
    //     for (int j = 0; j < n; j++) {
    //         cout << g[i][j] << "\t";
    //     }
    //     cout << endl;
    // }
    // cout << "-------------------------------------";
    




