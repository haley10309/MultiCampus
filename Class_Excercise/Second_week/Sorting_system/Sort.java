package Class_Excercise.Second_week.Sorting_system;

public interface Sort {
    public void ascending(int[] number);

    public void descending(int[] number);

    default void description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quick 정렬은 다른 원소와의 비교만으로 정렬을 수행하는 비교 정렬").append("\n");
        sb.append("Heap 정렬은 최대 힙 트리나 최소 힙 트리를 구성해 정렬을 하는 방법").append("\n");
        sb.append("Bubble 정렬은 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘 정렬").append("\n");

        System.out.println(sb);
    };
}