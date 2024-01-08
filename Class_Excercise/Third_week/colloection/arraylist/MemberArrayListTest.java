package Class_Excercise.Third_week.colloection.arraylist;

import Class_Excercise.Third_week.colloection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();

	    //회원 인스턴스 생성
	    Member memberYoon = new Member(1001, "윤해강");
	    Member memberLee = new Member(1002, "이용태");
	    Member memberHan = new Member(1003, "한세윤");
	    Member memberSol = new Member(1004, "이한솔");

	    //ArrayList에 회원추가
	    memberArrayList.addMember(memberYoon);
	    memberArrayList.addMember(memberLee);
	    memberArrayList.addMember(memberHan);
	    memberArrayList.addMember(memberSol);

	    memberArrayList.showAllMember();

	    memberArrayList.removeMember(memberYoon.getMemberId());
	    memberArrayList.showAllMember();

	}
}
