package strings.easy;

public class GoalParserInterception {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        command = command.replaceAll("\\(\\)", "o");
        command = command.replaceAll("\\(al\\)", "al");
        return command;
    }
}
