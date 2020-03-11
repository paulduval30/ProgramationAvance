package miniprojet.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe permetant de gérer des regex
 */
public class Match
{
    private Pattern pattern;
    private Matcher matcher;

    /**
     * Définis le patern
     * @param regex String la regex
     */
    public void setPattern(String regex)
    {
        this.pattern = Pattern.compile(regex.toUpperCase());
    }

    /**
     * Renvoie true si le text correspond au Patern. Sinon False
     * @param text String le texte a tester
     * @return boolean matching
     */
    public boolean matching(String text)
    {
        matcher = this.pattern.matcher(text.toUpperCase());
        return matcher.find();
    }
}
