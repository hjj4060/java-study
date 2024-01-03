package 혼자_공부하는_자바.Chapter11_기본API클래스;

import java.util.Objects;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
}
