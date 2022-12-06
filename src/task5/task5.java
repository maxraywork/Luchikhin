package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {

    public static void main(String[] args) {
        String text = "Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности обеспечивает широкому кругу специалистов участие в формировании систем массового участия. Равным образом постоянный количественный рост и сфера нашей активности позволяет оценить значение позиций, занимаемых участниками в отношении поставленных задач.";
        String[] wordArray = text.split("[\\s,.:!?]+");
        Pattern pattern = Pattern.compile("^[аоэиуыеёюя].*[аоэиуыеёюя]$");
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }
}
