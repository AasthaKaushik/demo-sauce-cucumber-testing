package factory;

import pages.LoginPage;
public class PageFactory {
    static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
    //static ThreadLocal<HomePage> HomePageTL = new ThreadLocal<HomePage>();

    public static LoginPage getLoginPage() {
        if(LoginPageTL.get()==null) {
            LoginPageTL.set(new LoginPage());
        }
        return LoginPageTL.get();
    }

    /*public static HomePage getHomePage() {
        if(HomePageTL.get()==null) {
            HomePageTL.set(new HomePage());
        }
        return HomePageTL.get();
    }*/
}
