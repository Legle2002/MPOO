class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);
    float var=-8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("##############Composicion##############");
    Persona persona1=new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha=new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getfNacimiento().getanio());
    System.out.println("##############Composicion2##############");
    Persona persona2=new Persona("Rafel","Zavala",5,11,2001);
    System.out.println(persona2);
    System.out.println("##############Coche con cuatro personas##############");
    Persona persona3=new Persona("Gustavo","Villa",8,11,2001);
    Persona persona4=new Persona("Octavio","Cazarez",2,9,2002);
    Coche coche1=new Coche("Lamborghini",2021,"Amarillo",4,true,780,persona1,persona2,persona3,persona4);
    System.out.println(coche1);
    Coche coche2=new Coche("Ferrari",2017,"Rojo",4,false,670,"Ji","Xu",6,1,2000,"Eric","Almazo",16,1,2002,"Emiliano","Aguilar",21,7,2002,"Sebastian","Vazquez",7,3,2002);
    System.out.println(coche2);
  }
}
