
package com.rop.response;

import com.rop.RopRequestContext;
import com.rop.security.MainError;
import com.rop.security.MainErrorType;
import com.rop.security.MainErrors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Locale;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class RejectedServiceResponse extends ErrorResponse  {

    public RejectedServiceResponse() {
    }

    public RejectedServiceResponse(RopRequestContext context) {
        MainError mainError = MainErrors.getError(MainErrorType.FORBIDDEN_REQUEST, context.getLocale(),
                                                  context.getMethod(),context.getVersion());
        setMainError(mainError);
    }
}

