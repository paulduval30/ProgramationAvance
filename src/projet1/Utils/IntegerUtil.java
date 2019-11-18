package projet1.Utils;

public abstract class IntegerUtil
{
    public static boolean isInteger(String s)
    {
        try
        {
            new Integer(s);
        }
        catch (Exception ignored)
        {
            return false;
        }
        return true;
    }
}
