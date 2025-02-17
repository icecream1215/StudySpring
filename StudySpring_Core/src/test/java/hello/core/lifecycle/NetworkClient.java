package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {
    // 가짜 네트워크 클라이언트임~~~ 로그로 라이프사이클 확인만

     private String url;

     // 생성자 호출
     public NetworkClient(){
         System.out.println("생성자 호출, url = " + url);
         //afterPropertiesSet 로 옮김
         //connect();
         //call("초기화 연결 메세지");
     }

     public void setUrl(String url){
         this.url = url;
     }

     //서비스 시작시 호출
     public void connect(){
         System.out.println("connect : " + url);
     }


     public void call(String message){
         System.out.println("call : " + url + " message = " + message);
     }

     //서비스 종료시 호출
     public void disconnect(){
         System.out.println("close : " + url);
     }

     /* implements InitializingBean, DisposableBean  사용할때
    @Override
    public void afterPropertiesSet() throws Exception {
        // 의존관계 주입 끝나면 호출하는 메서드
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메세지");
    }

    @Override
    public void destroy() throws Exception {
         // 소멸전에 호출하는 메서드
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
    */

    @PostConstruct
    public void init() {
        // 의존관계 주입 끝나면 호출하는 메서드
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        // 소멸전에 호출하는 메서드
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
