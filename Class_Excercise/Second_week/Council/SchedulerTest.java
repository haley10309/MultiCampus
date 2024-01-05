package Class_Excercise.Second_week.Council;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("전화 상담 할당 방식을 선택하세요: ");
        System.out.println("R: 한 명씩 차례로 할당");
        System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담언에게 할당");
        System.out.println("P: 우선 순위가 높은 고객 먼저 할당");
        System.out.println("A: 상담원이 전화 요청할때까지 대기");

        char ch = br.readLine().toUpperCase().charAt(0);
        Scheduler scheduler = null;
        
        if((ch == 'R')){
            scheduler = new RoundRobin();
        }else if ((ch == 'L')){
            scheduler = new Least_job();
        }else if((ch == 'P')){
            scheduler = new PriorityAllocation();
        }else if((ch == 'A')){
            scheduler  = new AgentGetCall();
        }else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
