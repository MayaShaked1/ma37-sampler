package workspace.netanya.sampler.FileReaderETL;

public class FileReaderETLException extends Exception{
    public FileReaderETLException (String message)
    {
        super(message);
    }
    public FileReaderETLException(Throwable cause) {
        // call appropriate parent constructor
        super(cause);
    }

    public FileReaderETLException(String message, Throwable throwable) {
        // call appropriate parent constructor
        super(message, throwable);
    }
}
