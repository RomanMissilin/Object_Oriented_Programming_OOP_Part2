public class ServiceStation {

    public void check(Checker[] checkers) {
        for (Checker checker : checkers) {
            checker.service();
        }
    }
}