package timetogeter.context.group.exception;

import timetogeter.global.interceptor.response.error.CustomException;
import timetogeter.global.interceptor.response.error.status.BaseErrorCode;

public class GroupInviteCodeExpired extends CustomException {
    public GroupInviteCodeExpired(BaseErrorCode status, String log) {
        super(status, log);
    }

}
