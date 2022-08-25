class Adv{

    public Adv(){

        System.out.println("in A");
    }
    public Adv(int i){

        System.out.println("in A Advance");
    }


}
class Blind extends Adv
{
    public Blind(int i){
        super(4);
        System.out.println("in B");
    }
    public Blind(){
        super();
        System.out.println("in B Advance");
    }

}
public class Supermethod {

    public static void main(String[] args){
        Blind obj =new Blind();

    }
}