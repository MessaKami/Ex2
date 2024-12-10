public class Ex3 {
    public static void main(String[] args) {
        System.out.println(replaceString("Salut à tous et à toutes", '*'));
    }

    public static String replaceString(String sentence, char caractere) {
        String result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 1) {
                result += caractere;
            } else {
                result += sentence.charAt(i);
            }

        }
        return result;
    }

}

