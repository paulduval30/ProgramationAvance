package miniprojet.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match
{
    private Pattern pattern;
    private Matcher matcher;

    public void setPattern(String regex)
    {
        this.pattern = Pattern.compile(regex.toUpperCase());
    }

    public boolean matching(String text)
    {
        matcher = this.pattern.matcher(text.toUpperCase());
        return matcher.find();
    }
}
