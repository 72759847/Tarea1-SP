
public class Sucecion
{
    public Sucecion(){

    }

    public long SucecionSerie(int n){
        long  ant = 1;
        long ant2 = 2;
        long ant3 = 3;
        long ant4 = 2;
        long actual = 1;
        int contador = 0;
        while(contador < n ){
            if(contador < n){
                actual = actual + ant ;
                contador++;

            }else{
            }
            if(contador < n){
                actual = actual + ant2;
                contador++;

            }else{
            }
            if(contador < n){

                actual = actual + ant3;
                contador++;

            }else{
            }if(contador < n){

                actual = actual + ant4;
                contador++;

            }else{
            }
            if(contador < n){
                actual = actual + ant;
                contador++;

            }else{
            }if(contador < n){

                actual = actual + ant2;
                contador++;

            } else{
            }
            if(contador < n){

                actual = actual + ant3;
                contador++;

            }else{
            }
            if(contador < n){
                actual = actual + ant4;
                contador++;

            }else{
            }
        }

        return actual;
    }

    public long SucecionPandovan(int n){
        long ant      = 1;
        long ant2     = 1; 
        long ant3     = 2;
        long ant4     = 2;
        long actual   = 1;
        int contador  = 0;
        while(contador < n){

            if(contador < n){
                actual = ant;
                contador++;
            }else{
            }if( contador < n){
                actual = ant2;
                contador++;
            }else{
            }
            if(contador < n){

                actual = ant3;
                contador++;
            }else{
            }if(contador < n){
                actual = ant4;
                contador++;
            }else{
            }
            if(contador < n){ 

                actual = ant2 + ant3;
                contador++;
            }else{
            }if(contador < n){

                actual = ant3 + ant4;
                contador++;
            }else{
            }
            if(contador < n){
                actual = actual + ant;
                contador++;
            }else{
            }
            if(contador < n){
                actual = actual + ant3;
                contador++;
            }else{
            }
            if(contador < n){
                actual = actual + ant3;
                contador++;
            }else{
            }if(contador < n){
                actual = actual + ant2 + ant3;
                contador++;
            }else{
            }if(contador < n){
                actual = actual + ant3 + ant4;
                contador++;
            }else{
            }
            if(contador < n){
                actual = actual + ant3 + ant4 + ant;
                contador++;
            }
        }

        return actual;
    }
}

