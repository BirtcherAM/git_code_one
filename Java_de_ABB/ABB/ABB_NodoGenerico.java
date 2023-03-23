package ABB;

public class ABB_NodoGenerico<V> {
	 
    private V value;
    private ABB_NodoGenerico<V> izq;
    private ABB_NodoGenerico<V> der;
     
    public ABB_NodoGenerico(V value, ABB_NodoGenerico<V> izq, ABB_NodoGenerico<V> der) {
        super();
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
 
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
 
    public ABB_NodoGenerico<V> getIzq() {
        return izq;
    }
 
    public void setIzq(ABB_NodoGenerico<V> izq) {
        this.izq = izq;
    }
 
    public ABB_NodoGenerico<V> getDer() {
        return der;
    }
 
    public void setDer(ABB_NodoGenerico<V> der) {
        this.der = der;
    }
}