package timetogeter.context.group.exception;

import timetogeter.global.interceptor.response.error.CustomException;
import timetogeter.global.interceptor.response.error.status.BaseErrorCode;

public class GroupNotFoundException extends CustomException {
    public GroupNotFoundException(BaseErrorCode status, String message) {
        super(status, message);
    }
}
