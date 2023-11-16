package list;

public class FilaCesar implements Fila{

    private No cabeca;

    public FilaCesar(){
        this.cabeca = null;
    }

    @Override
    public void enqueue(int item) {
        if(this.cabeca != null){
            No obj = new No(item);
            No fov = this.cabeca;
            while(fov.getProximo() != null){
                fov = fov.getProximo();
            } 
            fov.setProximo(obj);
        }
        else{
            No obj = new No(item);
            this.cabeca = obj; 
        }
    }

    @Override
    public int dequeue() {
        int x = 0;
        if(this.cabeca != null){
            this.cabeca = this.cabeca.getProximo();
            x = this.cabeca.getValor();
        }
        return x;
    }

    @Override
    public boolean isEmpty() {
        if(this.cabeca != null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public int size() {
        int size = 0;
        No fov = this.cabeca;
        while(fov.getProximo() != null){
            fov = fov.getProximo();
            size++;
        }
        return size;
    }

    
}
