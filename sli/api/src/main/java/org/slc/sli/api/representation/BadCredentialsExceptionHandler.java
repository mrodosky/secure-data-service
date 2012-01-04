package org.slc.sli.api.representation;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Hander for catching bad credentials exceptions.
 */
@Provider
@Component
public class BadCredentialsExceptionHandler implements ExceptionMapper<BadCredentialsException> {
    public Response toResponse(BadCredentialsException e) {
        Response.Status errorStatus = Response.Status.FORBIDDEN;
        return Response.status(errorStatus)
                .entity(new ErrorResponse(errorStatus.getStatusCode(), errorStatus.getReasonPhrase(),
                        "Access DENIED: " + e.getMessage())).build();
    }
}
