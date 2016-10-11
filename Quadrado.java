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
    
    public float funcao (float aresta) {
    return aresta * aresta; 
}
    
    public float quadradoFuncao (float aresta) {
    float resultado = funcao (aresta);
    return resultado;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
