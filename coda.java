class Coda {
    private Nodo head;
    private Nodo coda;
    private int contatore;

    public Coda() {
        this.contatore = 0;
        this.head = null;
        this.coda = null;
    }

    public boolean èVuota() {
        return this.contatore == 0;
    }

    public int dimensione() {
        return this.contatore;
    }

    public void stampa()
    {
        Nodo corrente = this.head;

        System.out.printf("[%d] ", this.dimensione());

        while (corrente != null) {
            System.out.printf("%d ---> ", corrente.valore);
            corrente = corrente.next;
        }
        System.out.printf("NULL\n");
    }

    public void inCoda(int valore)
    {
        Nodo temporaneo = new Nodo(valore);

        this.contatore++;

        if (this.head == null) {
            this.head = temporaneo;
        } else {
            this.coda.next = temporaneo;
        }

        this.coda = temporaneo;
    }

    public int rimuoviDaCoda()
    {
        int valore;

        valore = this.head.valore;

        this.head = this.head.next;

        if (this.head == null) {
            this.coda = null;
        }

        this.contatore--;

        return valore;
    }
};