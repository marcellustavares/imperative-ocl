package org.orcas.iocl.exception;

public class IOCLException extends Throwable {

    public IOCLException() {
        super();
    }

    public IOCLException(String msg) {
        super(msg);
    }

    public IOCLException(Throwable cause) {
        super(cause);
    }

    public IOCLException(String msg, Throwable cause) {
        super(msg, cause);
    }

}