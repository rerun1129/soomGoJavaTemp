package chapter06.accessmodifier.goodencapsule;

import static chapter06.accessmodifier.Membership.REGULAR;
import static chapter06.accessmodifier.Membership.SUPER;
import static java.time.LocalDate.now;

public class MemberService3 {

    public void validateGrade(){
        Account acc = new Account ( REGULAR, now ( ), now ( ) );
        if(acc.hasGradePermission ( SUPER )){
            //슈퍼회원인 경우에 따른 기능
        }
    }
}
