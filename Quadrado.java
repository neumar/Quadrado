/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neumar
 */
public class Quadrado {
    
    private float aresta;
    
    public double funcao (double aresta) {
    return 1 / aresta; 
}
    
    public double quadradoFuncao (double aresta) {
    double resultado = funcao (aresta);
    return resultado * resultado;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
