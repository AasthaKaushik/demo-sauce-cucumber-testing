package factory;

import pages.ForgetPasswordPage;
import pages.LoginPage;
public class PageFactory {
    static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
    //static ThreadLocal<HomePage> HomePageTL = new ThreadLocal<HomePage>();
    static ThreadLocal<ForgetPasswordPage> ForgetPasswordPageTL = new ThreadLocal<ForgetPasswordPage>();

    public static LoginPage getLoginPage() {
        if(LoginPageTL.get()==null) {
            LoginPageTL.set(new LoginPage());
        }
        return LoginPageTL.get();
    }

    public static ForgetPasswordPage getForgetPasswordPage() {
        if(ForgetPasswordPageTL.get()==null) {
        	ForgetPasswordPageTL.set(new ForgetPasswordPage());
        }
        return ForgetPasswordPageTL.get();
    }
    /*public static HomePage getHomePage() {
        if(HomePageTL.get()==null) {
            HomePageTL.set(new HomePage());
        }
        return HomePageTL.get();
    }*/
}
