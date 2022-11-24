package de.hebk.model.stack;


import de.hebk.model.node.Node;

/**
 *
 * @param <T>
 */
public class Stack<T> {
    private Node<T> first;

    /**
     * Die Anfrage liefert den Wert true, wenn der Stapel keine
     * Objekte enthält, sonst liefert sie den Wert false.
     */
    public boolean isEmpty(){
        // ToDo siehe queue
        if(first != null){
            return false;
        }
        return true;
    }

    /**
     * Das Objekt pObject wird oben auf den Stapel gelegt. Falls
     * pObject gleich null ist, bleibt der Stapel unverändert
     */
    public void push(T pObjekt){
        // ToDo das hier ist eher eine Methode für eine Schlange bei dir.. geht relativ einfach ;) ->
        /**
         *  Node<T> tmp = first
         *  first = new Node<T>(pObjekt)
         *  first.setNext(tmp)
         *
         */
        if(pObjekt != null) {
            Node<T> tmp = first;

            while (tmp != null) {
                tmp = tmp.getNext();
            }

            if (tmp == null) {
                tmp.setContext(pObjekt);
            }
        }
    }

    /**
     * Das zuletzt eingefügte Objekt wird von dem Stapel entfernt.
     * Falls der Stapel leer ist, bleibt er unverändert.
     */
    public void pop(){
        // ToDo du denkst zu kompliziert.. if (first != null) {first = first.netNext()} und fertig ;)
        if(first != null){
            Node<T> tmp = first.getNext();
            Node<T> tmp2 = first;

            while (tmp != null) {
                tmp = tmp.getNext();
                tmp2 = tmp2.getNext();
            }

            if (tmp == null && tmp2 != null) {
                tmp2 = null;
            }
        }
    }

    /**
     * Die Anfrage liefert das oberste Stapelobjekt. Der Stapel bleibt
     * unverändert. Falls der Stapel leer ist, wird null zurückgegeben.
     */
    public T top(){
        // ToDo wieder viel zu kompliziert ich denke, das hier ist copy paste von aneren Methoden.. return first.getContext()
        if(first != null){
            Node<T> tmp = first.getNext();
            Node<T> tmp2 = first;

            while (tmp != null) {
                tmp = tmp.getNext();
                tmp2 = tmp2.getNext();
            }

            if (tmp == null && tmp2 != null) {
                return tmp2.getContext();
            }
        }
        return null;
    }
}
