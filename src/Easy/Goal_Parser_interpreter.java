package Easy;

public class Goal_Parser_interpreter {
    public static String interpreter(String command) {
        String s = "";

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                String G="G";
                s=s+G;
                continue;
            } else if (command.charAt(i) == '(' && command.charAt(i+1)==')') {
                String o="o";
                s=s+o;
                i++;
                continue;
            }
            String al="al";
            s=s+al;
            i+=3;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(interpreter("G()(al)"));
    }
}
