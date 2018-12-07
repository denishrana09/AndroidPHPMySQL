package net.simplifiedcoding.androidphpmysql;

/**
 * Created by Belal on 25/11/16.
 */

public class Constants {

    private static final String ROOT_URL = "https://testwebsite.000webhostapp.com/Android/v1/";
    /*
    for localhost -> type 'ipconfig or ifconfig'(based on linux/mac/windows)
    get the 'ip' and your ROOT_URL will be like http://192.168.1.101/Android/v1/
    where replace your 'ip' with 192.168.1.101
    for localhost,you have to put "Android" folder in htdocs

    for online database host
    ROOT_URL will be like "http://yourwebsitename.com/Android/v1/"

    here I have 000webhost website named testwebsite,just put "Android" folder in
    public_html with "v1" and "includes" in it. obviously change Database host,username and password.
    * */

    public static final String URL_REGISTER = ROOT_URL+"registerUser.php";
    public static final String URL_LOGIN = ROOT_URL+"userLogin.php";


}
