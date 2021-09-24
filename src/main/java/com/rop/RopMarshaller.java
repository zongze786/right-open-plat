
package com.rop;

import java.io.OutputStream;


public interface RopMarshaller {
    void marshaller(Object object, OutputStream outputStream);
}

