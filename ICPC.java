
/**
 * Write a description of class ICPC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ICPC
{
    // instance variables - replace the example below with your own
    private int x;
    private String[] intersections;
    private String[] roads;
    private String[] signs;
    private boolean valid;
    

    /**
     * Constructor for objects of class ICPC
     */
    public ICPC()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Añade una interseccion con el color y la ubicacion especificada
     */
    public void addIntersection(String color, int x, int y){
        
    }
    
    /**
     * Añade una ruta con las intersecciones señaladas
     */
    public void addRoute(String intersectionA, String intersectionB){
        
    }
    
    /**
     * Pone una señal de velocidad con el limite especificado en la interseccion especificada
     */
    public void putSign(String intersectionA, String intersectionB, int speedLimit){
        
    }
    
    /**
     * Elimina la interseccion del color especificado
     */
    public void delIntersection(String color){
        
    }
    
    /**
     * Elimina el camino con las ubicaciones especificadas
     */
    public void delRoad(String locationA, String locationB){
        
    }
    
    /**
     * Quita el signo que está en las intersecciones especificadas
     */
    public void removeSign(String intersectionA, String intersectionB){
        
    }
    
    /**
     * Retorna la lista de las intersecciones actuales
     */
    public String[] intersections(){
       return intersections; 
    }
    
    /**
     * Hace invisible el mapa
     */
    public void makeInvisible(){
    
    }
    
    /**
     * Hace visible el mapa
     */
    public void makeVisibe(){
        
    }
    
    /**
     * 
     */
    public void finish(){
        
    }
    
    /**
     * Verifica si el mapa es valido
     */
    public boolean ok(){
        return valid;
        
    }
}
