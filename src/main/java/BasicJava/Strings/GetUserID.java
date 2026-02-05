package Strings;

public class GetUserID {

    public static void main(String[] args) {
        String eMail = ReplaceE.getStringIP();

        String ID = eMail.substring(0, eMail.indexOf("@"));
        System.out.println(ID);
    }

}
