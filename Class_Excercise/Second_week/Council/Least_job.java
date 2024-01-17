package Second_week.Council;

public class Least_job implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 할당된 고객이 적은 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다.");
    }

}
