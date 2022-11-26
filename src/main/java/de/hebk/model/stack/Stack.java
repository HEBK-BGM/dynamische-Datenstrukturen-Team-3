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
        return first == null;
    }

    /**
     * Das Objekt pObject wird oben auf den Stapel gelegt. Falls
     * pObject gleich null ist, bleibt der Stapel unverändert
     */
    public void push(T pObjekt){
        Node<T> tmp = first;
        first = new Node<T>();
        first.setContext(pObjekt);
        first.setNext(tmp);

    }

    /**
     * Das zuletzt eingefügte Objekt wird von dem Stapel entfernt.
     * Falls der Stapel leer ist, bleibt er unverändert.
     */
    public void pop(){
        if(first != null){
            first = first.getNext();
        }
    }

    /**
     * Die Anfrage liefert das oberste Stapelobjekt. Der Stapel bleibt
     * unverändert. Falls der Stapel leer ist, wird null zurückgegeben.
     */
    public T top() {
        // ToDo Wienands 2
        if(first == null) {
            return null;
        } else {
            return first.getContext();
        }
    }
}
