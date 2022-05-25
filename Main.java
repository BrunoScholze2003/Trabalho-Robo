import java.io.Console;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    FlinstonsRobot flinsRobot = new FlinstonsRobot();

      // Avançar para frente
      flinsRobot.flinsStatus();
      flinsRobot.goFront();

      //Recuar
      flinsRobot.flinsStatus();
      flinsRobot.goBack();
    
      //Virar para a direita
      flinsRobot.flinsStatus();
      flinsRobot.goLeft(160);
      
      //Virar a esquerda
      flinsRobot.flinsStatus();
      flinsRobot.goRight(90);
      
      //Nesse ponto o robo ja está sem bateria, você será notificado que ele nao ira se mover.
      flinsRobot.goRight(90);
  }
}
