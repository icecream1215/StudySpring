package hello.core.singleton;

public class StatefulService {
    private int price; //상태를 유지하는 필드 => 굳이 private으로 되어서 공유될 필요가 없음!!! 로컬 변수로 작업해도됨
    public void order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 문제되는 부분이 여기임!!
    }

    public int getPrice(){
        return price;
    }
}
