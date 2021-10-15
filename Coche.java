class Coche {
 //AQUÍ EMPIEZAN LOS ATRIBUTOS DE LA CLASE QUE ES EL COCHE
  String color;
  String marca;
  int numPuertas;
  int anio;
  int potencia;
  boolean automatico; //AQUÍ TERMINAN LOS ATRIBUTOS
  public Coche(){} //ESTE ES EL CONSTRUCTOR DEL OBJETO
  public Coche(String marca,int anio,String color,int numPuertas,boolean automatico,int potencia){
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
  } //AQUÍ ACABA EL CONSTRUCTOR DEL OBJETO
//AQUÍ EMPIEZAN LOS MÉTODOS
  public void encender(){
    System.out.println("Soy el coche de la marca " +marca+  ". Estoy encendiendo");
  }

  public void avanzar(boolean avanza ){
    if(avanza){
      System.out.println("Estoy avanzando a 10 [km/h]");
    }else{
      System.out.println("Voy a 0 [km/h]");
    }
  } 

  public void apagar(){
    System.out.println("Soy el coche de la marca " +marca+ ". Y estoy apagandome");
  }

  public void frenar(boolean frenar){
    if(frenar){
      System.out.println("Estoy frenado");
    }else{
     System.out.println("No estoy frenando");
    }
  }

  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir > numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero de puestas del coche");
    }else{
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }
  }
  
  @Override
  public String toString(){
    return "Coche("+"marca="+marca+" anio="+anio+" color="+color+" numpuertas="+numPuertas+" automatico="+automatico+" potencia="+potencia+")";
  }

}//AQUÍ ACABAN LOS MÉTODOS
