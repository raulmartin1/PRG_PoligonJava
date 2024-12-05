/*Classe per guarda Punts */
public class Punt {
	private int x;
	private int y;

	/* Constructor per defecte, sense paràmetres, inicialitza a un Punt de
	 * referència */
	public Punt () {
		this.x = 0;
		this.y = 0;
	}

	/* Constructor que rep el Punt per paràmetre */
	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
		}
	
	/* Getter
	 * @return eix x del Punt
	 */
	public int getX() {
		return x;
	}
	/* Getter
	 * @return eix y del Punt
	 */
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	/* Setter conjunt del Punt*/
	public void setPunt(int x, int y) {
			this.x = x;
			this.y = y;
		
		}
	/* Comprova si dos punts son iguals retornant un boolea */
    public boolean esIgual(Punt punt) {
		return ((punt.x == x) && (punt.y == y));
	}
	/* Imprimeix per pantalla el Punt */
    public String toString() {
		return("("+x+","+y+")");
	}

	/* Duplica el Punt escollit */
    public Punt copia (){
        Punt punt_copia = new Punt (x, y);
        return(punt_copia);
    }

    /* Calcula la distancia entre dos punts*/
    public double calcularDistancia(Punt p1, Punt p2)
    {
        double distancia;
        if (p1 != null && p2 != null)
		{
		int x1=p1.getX(); int y1=p1.getY();
        int x2=p2.getX(); int y2=p2.getY();
		
        /*formula distancia: √((x2-x1)²)+(y2-y1)²)
         * Math.sqrt(): raiz cuadrada
         * Math.pow: Al cuadrado, Math.pow(numero, el elevado)
          */
        distancia= Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
        return(distancia);
		}
		{
			return 0;
		}
    }

	/* Calcula la reflexió d'un punt */
    public Punt calcularReflexio(){
        x= -x; //cambiar signo de la componente y solamente
		return (this);
	}

	}
