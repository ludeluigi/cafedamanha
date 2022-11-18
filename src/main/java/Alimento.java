import java.util.List;

public class Alimento {

    public String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public boolean equals (Object obj){
        if (!(obj instanceof Alimento)){
            return false;
        }
        final Alimento other = (Alimento) obj;
        //return this.getNome().equals(other.getNome());
        return this.getItem().equals(other.getItem());
    }
    @Override
    public String toString() {
        return "Vou levar  : " + this.getItem();
    }
}


