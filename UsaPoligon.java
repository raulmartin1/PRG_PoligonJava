public class UsaPoligon {
    
    public static void main(String[] args) {

        Poligon p1 = new Poligon(5);
        p1.afegirVertex(new Punt(1,1));
        p1.afegirVertex(new Punt(1,4));
        p1.afegirVertex(new Punt(2,4));
        p1.afegirVertex(new Punt(2,6));
        
        validacioConstructorSenseParametres();
        validacioConstructorsAmbParametres(p1);
        validacioModificaUnVertex(p1);
        validacioConsultaUnVertex(p1);
        
        validacioCalcularPerimetre(p1);
        validacioCalcularReflexio(p1);
        validacioCopiaPoligon(p1);
        p1.calcularRefexioVertex(); //tornem al poligon inicial
        validacioCalcularCapsa(p1);

    }
     
    /* Funció que valida el constructor sense Parametres */
    private static void validacioConstructorSenseParametres()
    {
         Poligon p2 = new Poligon(0);
        System.out.println("Constructor sense parametres\n "+p2+"\n");
    }

    /* Funció que valida el constructor amb Parametres */
    private static void validacioConstructorsAmbParametres(Poligon p) {

        System.out.println("Constructor amb parametres\n "+p+"\n");
    }

    /* Funció que valida la Modificació d'un Vertex */
    private static void validacioModificaUnVertex(Poligon p) {
        Punt punt = new Punt(3,3);
        p.ModificaVertex(2, punt);
        System.out.println("Modificació d'un punt\n "+p+"\n");
    }

    /* Funció que valida que es pugui consultar un Vertex determinat*/
    private static void validacioConsultaUnVertex(Poligon p) {
        Punt punt = new Punt();
        punt = p.getVertex(3);
        System.out.println("El punt que volem consultar es: "+punt+"\n");

    }

    /* Funció que valida el calcularPerimetre */
    private static void validacioCalcularPerimetre(Poligon p) {
        
        double perimetre1 = p.calcularPerimetre();
        System.out.println("Perimetre del poligon es: "+perimetre1+"\n");
    }

    /* Funció que valida el calcularReflexió */
    private static void validacioCalcularReflexio(Poligon p) {

        p.calcularRefexioVertex();
        System.out.println("La reflexió del poligon es:\n "+p+"\n");
    }
    
    /* Funció que valida el copiaPoligon */
    private static void validacioCopiaPoligon(Poligon p) {
        p.copiaPoligon();
       System.out.println("Copia del poligon\n "+p+"\n"); 
    }

    /* Funció que valida el calcularCapsa */
    private static void validacioCalcularCapsa(Poligon p) {
        p.calcularCapsa();
        System.out.println("La capsa esta formada per les components:"); 
        System.out.println("xIni: "+p.getXIni());
        System.out.println("yIni: "+p.getYIni());
        System.out.println("xFi: "+p.getXFi());
        System.out.println("yFi: "+p.getYFi());
    }
}
    
    
