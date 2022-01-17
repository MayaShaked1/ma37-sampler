package workspace.netanya.sampler.FileLoader;

public class FileLoaderETLException extends Exception{
    public FileLoaderETLException (String message)
    {
        super(message);
    }
    public FileLoaderETLException(Throwable cause) {
        // call appropriate parent constructor
        super(cause);
    }

    public FileLoaderETLException(String message, Throwable throwable) {
        // call appropriate parent constructor
        super(message, throwable);
    }
}
