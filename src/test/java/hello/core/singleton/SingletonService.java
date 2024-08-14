package hello.core.singleton;

public class SingletonService {
    // 1. static 영역에 1개의 객체만 생성되게 함
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 해당 객체 인스턴스가 필요하다면 static 메서드 통해서만 조회하도록 만든다
    public static  SingletonService getInstance(){
        return instance;
    }

    // 3. 생성자를 private로 선언하여 외부에서 new 키워드를 통해 객체 생성을 하지 못하도록 막는다.
    private  SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
    //public static  void main(String[] args){
    //    SingletonService singletonService1 = new SingletonService();
    //    SingletonService singletonService2 = new SingletonService();
    //}
}
