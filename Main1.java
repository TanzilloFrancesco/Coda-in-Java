public class Main {

    public static void main(String[] args)
    {
        Coda q = new Coda();
        int valore;

        /* head ---> NULL */
        
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* aggiungere un elemento */
        
        q.inCoda(1);
        
        /* head ---> 1 ---> NULL */
        
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* aggiungere un altro elemento */
        
        q.inCoda(2);
        
        /* head ---> 1 ---> 2 ---> NULL */
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* aggiungere un altro elemento */
        q.inCoda(3);
        
        /* head ---> 1 ---> 2 ---> 3 ---> NULL */
        
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* aggiungere un altro elemento */
        q.inCoda(4);
        
        /* head ---> 1 ---> 2 ---> 3 ---> 4 ---> NULL */
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* rimuovere il primo elemento */
        
        if (!q.èVuota()) {
            valore = q.rimuoviDaCoda();
            System.out.printf("Elemento: %d\n", valore);
        }
        
        /* head ---> 2 ---> 3 ---> 4 ---> NULL */
        
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();

        /* rimuovere il primo elemento */
        
        if (!q.èVuota()) {
            valore = q.rimuoviDaCoda();
            System.out.printf("Elemento: %d\n", valore);
        }
        
        /* head ---> 3 ---> 4 ---> NULL */
        
        System.out.printf("E' vuota? %s\n", q.èVuota() ? "Si" : "No");
        q.stampa();
        System.out.println();
    }
}