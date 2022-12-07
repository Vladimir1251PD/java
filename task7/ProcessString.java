package src.ru.mirea.task7;

public class ProcessString implements StringMethods {
    String str;
    ProcessString(String s) {
        str = s;
    }
    @Override
    public int countNumbers() {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) count++;
        return count;
    }

    @Override
    public int countLetters() {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i))) count++;
        return count;
    }

    @Override
    public String processStr() {
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < str.length(); i++)
            if (i % 2 != 0) result.append(str.charAt(i));
        return result.toString();
    }

    @Override
    public String invert() {
        StringBuffer result = new StringBuffer(str);
        result.reverse();
        return result.toString();
    }
}
