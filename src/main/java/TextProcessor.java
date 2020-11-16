public class TextProcessor {

    public String upperCase(String text){
        return text.toUpperCase();
    }

    public String lowerCase(String text){
        return text.toLowerCase();
    }

    public String reverse (String text){
        return new StringBuilder(text).reverse().toString();
    }


}
