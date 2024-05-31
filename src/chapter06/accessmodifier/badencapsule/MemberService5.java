package chapter06.accessmodifier.badencapsule;

import static chapter06.accessmodifier.Membership.NORMAL;
import static chapter06.accessmodifier.Membership.REGULAR;
import static java.time.LocalDate.now;

public class MemberService5 {

    public void validateGrade(){
        Account acc = new Account ( REGULAR, now (), now ( ) );
        if(acc.getMembership() == NORMAL && acc.getExpDate().isAfter(now())){
            //일반 회원인 경우에 따른 기능
        }
    }
}
