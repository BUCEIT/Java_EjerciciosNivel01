/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01;

/**
 *
 * @author Jaime-PC
 */
public class EjerciciosNivel01 {

//declaro un array de integer para hacer pruebas 
    int[] listasNumeros = {333, 31, 200, 20, 5, 99, 14, 23};

    public int maximo(int[] lista) {
        int auxiliar = lista[0];//el maximo va a ser el primer elemento del array
        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[1];
            } else if (auxiliar > lista[3]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;

    }

    /**
     * metodo para quitar lso espacios en blanco a un String
     *
     * @param frase
     * @return
     */
    private String quitaEspaciosEnBlanco(String cadena) {
        //"Acaso hubo buhos aca"
        //Acasohubobuhosaca
        String auxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                auxiliar = auxiliar + cadena.charAt(i);
            }

        }
        return auxiliar;
    }

    public boolean esPalindromo(String frase) {
        //este programa devuelve verdadero si la frase tiene los mismos caracteres
        //de izquierda a derecha y de derecha a izqueirda 

        //primera fase:quitar los espacios en blanco de la cadena
        String auxiliar2 = quitaEspaciosEnBlanco(frase);
        
        //2ºpasamos a minusulas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();
        
        //3º voy a usar el metodoo de los indices
        int indiceIzquierdo =0;
        int indiceDerecho = auxiliar2.length()-1;
        
        while (auxiliar2.charAt(indiceIzquierdo)==auxiliar2.charAt(indiceDerecho)&& indiceIzquierdo<=indiceDerecho){
          indiceIzquierdo++;
          indiceDerecho--;
        }
        
        if (indiceIzquierdo<indiceDerecho){ //se ha salido antes de llegar al medio por lo tantyo no es palindromo
            
            return false;// no son palindromos
        }
        else{
            return true;//si que es palindromo pporque los indices se han cruzado
        }
       

    }
    
    public boolean esIsograma (String palabra){
        //este metodo devuelve true si la palabra no tiene 
        //ninguna letra repetida
        //y false si se repite alguna
        
        for (int i=0; i<palabra.length(); i++){
            for (int j=i+1; j<palabra.length();j++){
                if(palabra.charAt(i)== palabra.charAt(j)){
                    return false;
                }
            }
        }
        //si ha recorrido los dos bucles sin salir en el return false
        //es porque la palabra no tiene letras repetidas.
        return true;
        
    }

    /**0
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01 ejercicio = new EjerciciosNivel01();

        System.out.println(ejercicio.listasNumeros[0]);

        System.out.println(ejercicio.maximo(ejercicio.listasNumeros));

        System.out.println("palindromo:" + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("palindromo:" + ejercicio.esPalindromo("estonoes "));
        
        
        System.out.println("la palabra murcielago " + ejercicio.esIsograma("murcielago"));
        System.out.println("la palabra carreta" + ejercicio.esIsograma("carreta"));
    }

}
