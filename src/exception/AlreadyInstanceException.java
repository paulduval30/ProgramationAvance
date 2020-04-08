package exception;

public class AlreadyInstanceException extends Exception
{
    public AlreadyInstanceException()
    {
        super("Class already instanciate");
    }
}
