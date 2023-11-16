package list;

public class FilaComPilhaCesar implements FilaComPilha{
    PilhaCesar p1;
    PilhaCesar p2;

    public FilaComPilhaCesar(){
        this.p1 = new PilhaCesar();
        this.p2 = new PilhaCesar();
    }

    @Override
    public void enqueue(int item) {
        p1.push(item);
    }

    @Override
    public int dequeue() {
        No fov = p1.getLista().getCabeca();
        while(fov != null){
            p2.push(fov.getValor());
            fov = fov.getProximo();
    
        }
        return p2.pop();
    }

    @Override
    public boolean isEmpty() {
        if(p1.isEmpty() == true && p2.isEmpty() == true){
            return true; 
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    
}
