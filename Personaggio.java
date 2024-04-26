
public abstract class Personaggio {

    protected int vita;
    protected int attacco;
    protected int difesa;

    public Personaggio(int vita, int attacco, int difesa) {
        this.vita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
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



