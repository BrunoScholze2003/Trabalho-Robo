public class FlinstonsRobot {

  public int battery = 40;

  //Método que permite o robo a ir para frente.
  public void goFront(){
    if(this.battery > 10){
        System.out.println("avante mestre! Vamos para frente.");
        this.battery = this.battery - 8;
    }else{
        System.out.println("FlinsRobot entrou em modo de carregamento, Não pode se mover no momento.");
        
    }
  }

  //Método que permite o robo a ir para Tras.
  public void goBack(){
    if(this.battery > 10){
        System.out.println("Recuando mestre, só um minuto!");
        this.battery = this.battery - 8;
    }else{
        System.out.println("FlinsRobot entrou em modo de carregamento, Não pode se mover no momento.");
    }   
  }

  //Método que permite o robo a ir para a esquerda.
  public void goLeft(int graus){
    if(this.battery > 10){
        System.out.println("Avançando " + graus + "º para a esquerda.");
        this.battery = this.battery - 8;
    }else{
        System.out.println("FlinsRobot entrou em modo de carregamento, Não pode se mover no momento.");
    }      
  }

  //Método que permite o robo a ir para a direita.
  public void goRight(int graus){
    if(this.battery > 10){
        System.out.println("Avançando " + graus + "º para a direita.");
        this.battery = this.battery - 8;
    }else{
        System.out.println("FlinsRobot entrou em modo de carregamento, Não pode se mover no momento.");
    }    
  }

  //Metodo para ver status do flinsRobot
  public void flinsStatus(){
    if(this.battery > 10){
        System.out.println("Status : Ativo |" + this.battery +"% De bateria.");
    }else{
        System.out.println("Status : Carregando |" + this.battery +"% De bateria.");
    }
  }

}
