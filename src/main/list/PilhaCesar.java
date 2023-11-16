package list;

public class PilhaCesar implements Pilha{
    ListaLigada lista;
    public PilhaCesar(){
        this.lista = new ListaLigada();
    }
    public ListaLigada getLista(){
        return this.lista;
    }
    @Override
    public boolean isEmpty() {
        if(this.lista.getCabeca() != null){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public void push(int item) {
        No obj = new No(item);
        if(lista.getCabeca() != null){
            No fov = this.lista.getCabeca();
            while(fov.getProximo() != null){
                fov = fov.getProximo();
            }
            fov.setProximo(obj);
        }
        else{
            this.lista.setCabeca(obj);
        }
    }
    @Override
    public int pop() {
        int x = 0;
        if(lista.getCabeca() != null){
            No fov = this.lista.getCabeca();
            while(fov.getProximo() != null){
                fov = fov.getProximo();
                x++;
            }
            this.lista.removeFim();
            return x;
        }
        else{
            return x;
        }
    }
    
}
