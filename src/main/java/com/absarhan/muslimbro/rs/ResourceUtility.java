package com.absarhan.muslimbro.rs;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ResourceUtility {

    public static Response buildOkResponse(Object body) {
        return Response
                .status(Response.Status.OK)
                .entity(body)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    public static Response buildNoContentResponse() {
        return Response
                .status(Response.Status.NO_CONTENT)
                .build();
    }

    public static Response buildBadRequestResponse(Object body) {
        return Response
                .status(Response.Status.BAD_REQUEST)
                .entity(body)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    public static Response buildNotFoundResponse(Object body) {
        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(body)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
