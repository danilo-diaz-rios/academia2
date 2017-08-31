#DOCUMENTACION:

#Metodo Factory#

Este metodo consiste en utilizar una clase constructora (al estilo del Abstract Factory) abstracta con unos
cuantos métodos definidos y otro(s) abstracto(s): el dedicado a la construcción de objetos de un subtipo de 
un tipo determinado. Es una simplificación del Abstract Factory, en la que la clase abstracta tiene métodos
concretos que usan algunos de los abstractos; según usemos una u otra hija de esta clase abstracta, tendremos
uno u otro comportamiento.

*Implementacion:*

 public class Factory {


    public static universidad obtenerpersona(String tipo) {

        if (tipo.equals("estudiante")) {
            return new estudiante();
        } else if (tipo.equals("profesor")) {
            return new profesor();
        } else if (tipo.equals("administrativo")) {
            return new administrativo();
        }
        return null;

    }


    
Para este caso tenemos una clase llamada factory, en el cual tenemos un metodo llamado ontener persona
que nos permitira retornar un objeto de tipo, Estudiante, Profesor, Administrativo.
    
#Metodo Singleton#
    
es un patrón de diseño que permite restringir la creación de objetos pertenecientes a una clase o el valor de un 
tipo a un único objeto.

Su intención consiste en garantizar que una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella.

*Implementacion:*

public class Singleton {

    public Map<String, Object> memoria;

    private static Singleton instance = null;

    private Singleton() {
        memoria = new HashMap<String,Object>();
    }

    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}

se creo una clase llamada Singleton, que en esta clase se esta creando una instancia de memoria para asi poder hacer uso de 
la clase MainActivity

*Referencias*
*https://es.wikipedia.org/wiki/Singleton
*https://es.wikipedia.org/wiki/Factory_Method_(patr%C3%B3n_de_dise%C3%B1o)

