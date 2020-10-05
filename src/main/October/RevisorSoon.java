package main.October;

public class RevisorSoon {

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append( "\n" + role + ":" + "\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":"))
                    result.append((i + 1) + ") " +textLines[i].replaceFirst(role + ": ", "") + "\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    }


}
