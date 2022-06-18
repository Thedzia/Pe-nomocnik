public class Proxy {
    public static void main(String[] args) {
        User user = new User("Facebookcom", "password");
        FolderProxy folderProxy = new FolderProxy(user);
        folderProxy.performOperations();

        User userWrong = new User("abc", "abc");
        FolderProxy folderProxyWrong = new FolderProxy(userWrong);
        folderProxyWrong.performOperations();
    }
}
