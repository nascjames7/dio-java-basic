public class SmartTv {    

       boolean ligada = false;
       int canal = 1;
       int volume = 25;

       //Criar uma classe que represente uma Smart TV.
       //1.Ela tenha as caracerísticas: ligada (boolean), canal (int) e volume (int).
       //2.Nossa TV poderá ligar e desligar, e assim, mudar o estado ligada. 
       //3.Nos TV aumentaráou diminuirá o volume sempre em +1 ou -1.
       //4.Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

       public void ligar(){

        ligada = true;
       }

       public void desligar(){

        ligada = false;
       }

       public void aumentarVolume(){

        volume++;
       }

       public void diminuirVolume(){

        volume--;
       }

       public void aumentarCanal(){

        canal++;
       }

       public void diminuirCanal(){

        canal--;
       }

       public void mudarCanal(int novoCanal){

        canal = novoCanal;
       }
    }


}
