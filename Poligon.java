public class Poligon {

private int numVertexs;
private Punt[] vertexs; 

/* Creem els punts incial y final de la capsa del calcularCapsa */
public static int xIni=999; //Creem punts molt grans de manera que es vagin reduint fins aconseguir el que volem 
public static int yIni=999;
public static int xFi=999;
public static int yFi=999;

/* Constructor que rep el num de vertexs per paràmetre */
public Poligon(int numVertexs) {
    vertexs = new Punt[numVertexs];  //Reservem espai per poder guardar fins a numVertexs
    this.numVertexs = 0;             //Encara no tenim cap vertex guardat
}

/* Setter d'un nou vertex al poligon */
public void ModificaVertex(int pos, Punt v) {
    if (pos >= 0 && pos < numVertexs) {
      vertexs[pos] = v.copia();
}
}

/* Getter del vertex del poligon a la posició que escollim */
public Punt getVertex (int pos) {
    if (pos >= 0 && pos < numVertexs) return (vertexs[pos]);
    else return (null);

}

/* Getter del numVertexs */
public int getNumVertexs() {
    return numVertexs;
}

/* Afegim un nou vertex a la seguent posició la taula vertexs */
public void afegirVertex(Punt v) {
    if(numVertexs < vertexs.length) {
        vertexs[numVertexs]=v.copia();
        numVertexs++;
    }
}

/* Imprimeix per pantalla els vertexs del poligon */
public String toString() {
    String aux = "POLIGON => nombre de vertexs: "+numVertexs;
    for (int i = 0; i < numVertexs; i++) {
        aux = aux + "\n\t Punt posicio "+i+": "+vertexs[i];
    }
    return aux;
    }

/* Calcula el perimetre del poligon */
public double calcularPerimetre() {
    double perimetre = 0;
    double distancia = 0;

    if (numVertexs < 2) {   //Comprovem si te suficients vertexs per crear un poligon
        return perimetre;   //Retornem perimetre=0 ja que no es pot calcular
    }

    for (int pos = 0; pos < numVertexs-1 ; pos++){   

        Punt v1 = vertexs[pos];
        Punt v2 = vertexs[pos+1];

        if (v1 != null && v2 != null){
        distancia = v1.calcularDistancia(v1, v2);   //Calculem la distancia entre cada vertex seguidament
        perimetre = perimetre + distancia;          //Anem sumant aquestes distancies 
        }
        else
        {
            System.out.println("No hay suficientes puntos para calcularlo");
        }
    }

    Punt vInicial = vertexs[0];
    Punt vFinal = vertexs[numVertexs];
    distancia = vInicial.calcularDistancia(vInicial,vFinal);   //Calculamos la distancia del punto final al inicial
    perimetre = perimetre + distancia;                          //Tanquem el Poligon
    
    
return perimetre;
}

/* Calcula la reflexio del poligon sobre eix X */
public void calcularRefexioVertex() {
    for (int pos = 0; pos < numVertexs; pos++){
        vertexs[pos].calcularReflexio();
    }
}

/* Fa una copia del poligon */
public Poligon copiaPoligon() {
    Poligon poligon_copia = new Poligon(numVertexs-1);
    for (int pos = 0; pos < numVertexs-1; pos++){
        poligon_copia.vertexs[pos] = vertexs[pos].copia();
    }
return poligon_copia;
}

/* Calcula la capsa que crea el poligon */
public void calcularCapsa() {
if (numVertexs <= 2) {
    System.out.println("No hi ha vertexs suficients per fer una capsa");
}
else{
    for (int pos = 0; pos < numVertexs; pos++) {
    
        Punt v = vertexs[pos];
        int x = v.getX();  // cogemos la componente x del vertex en la posició 'pos'
        int y = v.getY();
    
        if (x < xIni) xIni = x; // Guardem el punt mes petit de l'eix x a xIni
        if (y < yIni) yIni = y;
    
    }
    
    for (int pos = 0; pos < numVertexs; pos++) {
        Punt v = vertexs[pos];
        int x = v.getX();  // cogemos la componente x del vertex en la posició 'pos'
        int y = v.getY();
        
        xFi=xIni;
        yFi=yIni;

        if (x > xFi) xFi = x;   // Guardem el punt mes gran de l'eix x a xFi
        if (y > yFi) yFi = y;
        }
    }
}

/* Getters de les components de la Capsa */
public int getXIni() {
    return xIni;
}
public int getYIni() {
    return yIni;
}
public int getXFi() {
    return xFi;
}
public int getYFi() {
    return yFi;
}

}




