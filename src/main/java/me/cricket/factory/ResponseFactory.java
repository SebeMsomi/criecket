package me.cricket.factory;

import me.cricket.domain.ResponseObj;

public class ResponseFactory {

    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription) {
        return new ResponseObj(responseCode, responseDescription);
    }
}
