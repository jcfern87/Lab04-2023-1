package list;


public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    public No getCabeca(){
        return this.cabeca;
    }
    public void setCabeca(No cabeca){
        this.cabeca = cabeca;
    }

    @Override
    public boolean buscaElemento(int valor) {
        No obj = this.cabeca;
        while(obj != null){
            if(obj.getValor() == valor){
                return true;
            }
            obj = obj.getProximo();
        }
        return false;    
    }

    @Override
    public int buscaIndice(int valor) {
        int index = 0;
        No obj = cabeca;
        while(obj != null){
            if(obj.getValor() == valor){
                return index;
            }
            index++;
            obj = obj.getProximo();
        }
        return index;
    }

    @Override
    public int minimo() {
        No obj = cabeca;
        int min = obj.getValor();
        while(obj != null){
            if(obj.getValor() < min){
                min = obj.getValor();
            }
            obj = obj.getProximo();
        }
        return min;
    }

    @Override
    public int maximo() {
        No obj = cabeca;
        int max = obj.getValor();
        while(obj != null){
            if(obj.getValor() > max){
                max = obj.getValor();
            }
            obj = obj.getProximo();
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        return 2;
    }
        

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        if(cabeca != null){
            No obj = this.cabeca;
            while(obj.getProximo() != null){
                obj = obj.getProximo();
            }
            obj.setProximo(new No(valor));
        }
        else{
            cabeca = new No(valor);
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if(buscaIndice == 0){
            No obj = new No(valor);
            obj.setProximo(cabeca);
            this.cabeca = obj;
        }
        else{
            No obj = cabeca;
            int index = 0;
            while(obj != null){
                if(index != buscaIndice){
                    obj = obj.getProximo();
                    index++;
                }
            }

        }
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){ 
            this.cabeca = new No(valor); 
        }
        else{
            No n = new No(valor); 
            n.setProximo(this.cabeca); 
            cabeca = n; 
        }
        
    }

    @Override
    public void insereFim(int valor) {
        if(cabeca != null){
            No obj = this.cabeca;
            while(obj.getProximo() != null){
                    obj = obj.getProximo();
                }
                obj.setProximo(new No(valor));
        }
        else{
            cabeca = new No(valor);
        }
    }

    @Override
    public void remove(int valor) {
        if(this.cabeca.getValor() == valor){
            this.cabeca = null;
        }
        else{
            No obj = cabeca;
            while(obj.getProximo() != null){
                if(obj.getProximo().getValor() == valor){
                    obj.setProximo(obj.getProximo().getProximo());
                }
                else{
                    obj = obj.getProximo();
                }
            }
        }
    }

    @Override
    public void removeIndice(int indice) {
        if(indice == 0){
            if(this.cabeca.getProximo() != null){
                this.cabeca = this.cabeca.getProximo();
            }
            else{
                this.cabeca = null;
            }
        }
        else{
            int index = 1;
            No obj = cabeca;
            while(obj != null){
                if(index == indice){
                    obj.setProximo(obj.getProximo().getProximo());
                }
                else{
                    obj = obj.getProximo();
                    index++;
                }
            }
        }
    }

    @Override
    public void removeInicio() {
        if(this.cabeca != null){
            No obj = this.cabeca.getProximo();
            this.cabeca = obj;
        }
    }

    @Override
    public void removeFim() {
        if(this.cabeca != null){
            No obj = this.cabeca;
            while(obj.getProximo().getProximo() != null){
                obj = obj.getProximo();
            }
            obj.setProximo(null);
        }
    }
    
}