class Perro{
  String nombre;//AQUÍ EMPIEZAN LOS ATRIBUTOS DE LA CLASE QUE ES EL PERRO
  float peso;
  int edadAnios;
  int edadMeses;
  String raza;
  boolean macho;//AQUÍ TERMINAN LOS ATRIBUTOS
  public Perro(){} //ESTE ES EL CONSTRUCTOR DEL OBJETO 
  public Perro(String nombre,float peso,int edadAnios,int edadMeses,String raza,boolean macho){
    this.nombre = nombre; 
    this.peso = peso;
    this.edadAnios = edadAnios;
    this.edadMeses = edadMeses;
    this.raza = raza;
    this.macho = macho;
  }//AQUÍ ACABA EL CONSTRUCTOR DEL OBJETO
  public void comer(String comida){ //AQUÍ EMPIEZAN LOS MÉTODOS
    System.out.println("Soy "+nombre+" y estoy comiedo "+ comida);
  }

  public void ladrar(boolean ladrar){
    if(ladrar){
      System.out.println("Estoy ladrando");
    }else{
      System.out.println("No estoy ladrando");
    }
  }
  public void jugar(String juego){
    System.out.println("Estoy jugando a "+juego);
  }

  public void dormir(int minutos){
    System.out.println("He estado durmiendo por "+minutos+" minutos");
   }

   public void pasear(String lugar){
     System.out.println("Voy a pasear a "+lugar);
   }
  
  @Override
  public String toString(){
    return "Perro{"+"nombre="+nombre+"  peso="+peso+"  edadAnios="+edadAnios+"  edadMeses="+edadMeses+"  raza="+raza+"  macho: "+macho+"}";
  }
}//AQUÍ ACABAN LOS MÉTODOS
