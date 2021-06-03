package lesson04.strings;

public class StringBuilderTask {
    public static void main(String[] args) {
        String name = "Vasiliy";
        String birthday = "05/07/1998";
        String gender = "Male";
        String profession = "developer";

        String info = getInfo(name, birthday, gender, profession);

        System.out.println(info);
    }

    public static String getInfo(String name, String birthday, String gender, String profession) {
        StringBuilder info = new StringBuilder("INFO");
        info.append("\n");
        info.append("Name: ").append(name).append(";");
        info.append("\n");
        info.append("Birthday: ").append(birthday.replace("/","_")).append(";");
        info.append("\n");
        info.append("Gender: ").append(gender).append(";");
        info.append("\n");
        info.append("Profession: ").append(profession).append(".");

        return info.toString();
    }
}
