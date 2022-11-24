package de.hebk.model.queue;

import de.hebk.model.node.Node;

/**
 * Objekte der Klasse Queue (Warteschlange) verwalten beliebige Objekte nach dem
 * First-In-First-Out-Prinzip, d.h., das zuerst abgelegte Objekt wird als erstes wieder
 * entnommen.
 * @param <T>
 */
public class Queue<T> {
    private Node<T> first;

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine
     * Objekte enthält, sonst liefert sie den Wert false.
     */
    public boolean isEmpty(){
        //ToDO viel einfacher mit "return first == null;"
        if(first != null){
            return false;
        }
        return true;
    }

    /**
     * Das Objekt pObject wird an die Schlange angehängt. Falls
     * pObject gleich null ist, bleibt die Schlange unverändert
     */
    public void enqueue(T pObject){
        if(pObject != null) {
            Node<T> tmp = first;
            // ToDo es fehlt der Fall first == null, denn dann ist einfach first = new Node<T>(pObject)

            // ToDo Um ein Element einzängen musst du while (tmp.getNext() != null) laufen um dann tmp.setnext(new Node<T>(pObject) zu setzen
            while (tmp != null) {
                tmp = tmp.getNext();
            }

            if (tmp == null) {
                // ToDO siehe Kommentar oben. Wenn tmp.next null ist, dann kannst du davon nicht mit setContext den Inhalt setzen (null pointer exception)
                tmp.setContext(pObject);
            }
        }
    }


    /**
     * Das erste Objekt wird aus der Schlange entfernt. Falls die
     * Schlange leer ist, wird sie nicht verändert.
     */
    public void dequeue(){
        Node<T> tmp = first;

        if (tmp != null) {
            //ToDo was soll tmp = null machen?
            tmp = null;

            first = first.getNext();
        }
    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange. Die
     * Schlange bleibt unverändert. Falls die Schlange leer ist, wird
     * null zurückgegeben.
     */
    public T front(){
        if(first != null) {
            return first.getContext();
        }
        return null;
    }

}
