/*Diseña un TDA que permita construir objetos que almacenen una matriz CUADRADA de enteros.

El constructor de la clase recibirá un ENTERO indicando el tamaño de RENGLONES Y COLUMNAS que se deberá construir. 

Las operaciones y comportamiento es el siguiente:

- sumarValores: éste método no tiene parámetro, y obtiene la suma de TODOS LOS VALORES capturados de la matriz, 
retornando la suma de los mismos.

- sumarValoresRenglon(int numRenglon): éste método regresa la suma de valores del renglón indicado por la variable 

- sumarValoresColumna(int numColumna): igual que el anterior pero para columnas, indicando por la variable numColumna 
    el índice de columa que se desea sumar.

- intercambioRenglones(int reng1, int ren2): Realiza un intercambio de datos entre el renglon 1 y renglon 2.

- intercambioColumnas(int col1, int col2): Realiza un intercambio de valores entre las columnas 1 y 2.

- copiarRenglon(int origen, int destino): Realiza un copiado de valores desde renglon origen hacia renglón destino.

- copiarColumna(int colOrigen, int ColDestino): Copia los datos de la columna origen sobre la destino.

- inversa: no lleva parámetro, retorna la matriz inversa, es decirlo los renglones los vuelve columnas y viceversa.*/
/**
 * @author Osmar
 */


import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;
public class TDA {

    int size;
    int matrixAux[][];
    
    public TDA(int size) 
    {
        this.size = size;
        matrixAux = new int[size][size];
    }

    
    public int sumarValoresRenglon(int ren)
    {
        int  a = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 0; j++) {
                a = a + matrixAux[i][j];
            }
        }
        return a;
    }
    
    public int sumarValoresColumna(int col)
    {
        int  a = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 0; j++) {
                a = a + matrixAux[j][i];
            }
        }
        return a;
    }
    
    public void intercambioColumna(int ren1, int ren2)
    {
        int a[] = new int[2];
        int matrixAux[][] = new int[2][2];
        for (int i = 0; i < 2; i++)
        {
            a[i] = matrixAux[i][0];
            matrixAux[i][0] = matrixAux[i][1];
            matrixAux[i][1] = a[i];
            
        }
        
       
    }
    
    public int intercambioRenglon(int ren, int col)
    {
        
        int a[] = new int[2];
        int matrixAux[][] = new int[2][2];
        for (int i = 0; i < 2; i++)
        {
            a[i] = matrixAux[0][i];
            matrixAux[0][i] = matrixAux[1][i];
            matrixAux[1][i] = a[i];
            
        }
        return 0;
    }
    
    public void copiarRenglon(int destinyR,int originR)
    {
        matrixAux[destinyR][size] = matrixAux[originR][size];
        
    }
    
    public void copiarColumna(int destinyC, int originC)
    {
        matrixAux[size][originC] = matrixAux[size][originC];
        
    }
    
    
    public void inversa(int a)
    {
        int matrixAux1[][] = new int [size][size];
         for(int i = 0; i < size; i++)
            {
            for (int j = 0; j < size; j++)
            {
                matrixAux1[i][j] = matrixAux [j][i];
            }
        }
    }

    
    
}
