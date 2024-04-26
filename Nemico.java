public abstract class Nemico {
    protected String nome;
    protected int attacco;
    protected int difesa;
    protected int vita;

    public Nemico(String nome, int attacco, int difesa, int vita) {
        this.nome = nome;
        this.attacco = attacco;
        this.difesa = difesa;
        this.vita = vita;
    }

    public void setVita(int op){
        this.vita += op;
    }

    public void setAttacco(int op){
        this.attacco += op;
    }

    public void setDifesa(int op){
        this.difesa += op;
    }

    public int getVita(){
        return this.vita;
    }

    public int getAttacco(){
        return this.attacco;
    }

    public int getDifesa(){
        return this.difesa;
    }

}

class Pipistrello extends Nemico {
    private static final int ATTACCO_MINIMO = 1;
    private static final int ATTACCO_STANDARD = 3;
    private static final int ATTACCO_MASSIMO = 5;

    public Pipistrello() {
        super("Pipistrello", ATTACCO_STANDARD, 2, 6);
    }

    
}

class Canelupo extends Nemico {
    private static final int ATTACCO_MINIMO = 2;
    private static final int ATTACCO_STANDARD = 4;
    private static final int ATTACCO_MASSIMO = 6;

    public Canelupo() {
        super("Canelupo", ATTACCO_STANDARD, 4, 10);
    }

    
}

class Drago extends Nemico {
    private static final int ATTACCO_MINIMO = 3;
    private static final int ATTACCO_STANDARD = 5;
    private static final int ATTACCO_MASSIMO = 9;

    public Drago() {
        super("Drago", ATTACCO_STANDARD, 6, 12);
    }

    
}