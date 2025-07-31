package day07;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member();
        member.name = "홍길동";
        member.age = 30;
        member.phoneNumber = 64518030;
        member.email = "wkdeodus92";
        member.home = "서울";
        member.weight = 57.6;

        System.out.println("이름 : " + member.name + " 나이: " + member.age +
        " 핸드폰: " + member.phoneNumber + " 이메일 : " + member.email + " 거주지 : " + member.home);
    }
}

