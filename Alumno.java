class Alumno{
  String nombre;//AQUÍ EMPIEZAN LOS ATRIBUTOS DE LA CLASE QUE ES EL ALUMNO
  int edadAnios;
  float promedioMateria;
  float promedioGeneral;
  boolean llorar;
  boolean noDormir;
  boolean aprobado;//AQUÍ TERMINAN LOS ATRIBUTOS
  public Alumno(){} //ESTE ES EL CONSTRUCTOR DEL OBJETO 
  public Alumno(String nombre,int edadAnios,float promedioMateria,float promedioGeneral,boolean llorar,boolean noDormir,boolean aprobado){
    this.nombre = nombre; 
    this.edadAnios = edadAnios;
    this.promedioMateria = promedioMateria;
    this.promedioGeneral = promedioGeneral;
    this.llorar = llorar;
    this.noDormir = noDormir;
    this.aprobado= aprobado;
  }//AQUÍ ACABA EL CONSTRUCTOR DEL OBJETO
  @Override
  public String toString(){
    return "Alumno{"+"nombre="+nombre+"  edad (anios)="+edadAnios+"  promedio en la materia="+promedioMateria+"  promedio general="+promedioGeneral+"  llorar="+llorar+"  no dormir="+noDormir+"  aprobado="+aprobado+"}";
  }
}//AQUÍ ACABAN LOS MÉTODOS
