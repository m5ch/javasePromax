package task.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import task.bean.Business;
import task.bean.Customer;
import task.bean.Movie;
import task.bean.User;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ Classname MovieSystem
 * @ Description TODO
 * @ Date 2022/4/24 14:56
 * @ Created by 落尘
 */
public class MovieSystem {
    /*
        定义系统的数据容器用于存储数据
        （客户对象、商家对象）
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /*
        存储系统全部商家和其拍片信息
        商家1 = [p1,p2,p3]
        ...
     */
    public static Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();

    /*
        准备一些测试数据
     */
    static{
        Customer c1 = new Customer();
        c1.setLoginName( "ldh888");
        c1.setPassword( "123456");
        c1.setUserName("黑马刘德华");
        c1.setGender( '男');
        c1.setMoney(10000);
        c1.setPhone ( "110110");
        ALL_USERS.add(c1);

        Customer c2 = new Customer();
        c2.setLoginName( "xf888");
        c2.setPassword( "123456");
        c2.setUserName("黑马小芳");
        c2.setGender( '女');
        c2.setMoney(2000);
        c2.setPhone ( "120120");
        ALL_USERS.add(c2);

        Customer c3 = new Customer();
        c3.setLoginName( "zyf888");
        c3.setPassword( "123456");
        c3.setUserName("黑马张一帆");
        c3.setGender( '男');
        c3.setMoney(20000);
        c3.setPhone ( "130130");
        ALL_USERS.add(c3);

        Customer c4 = new Customer();
        c4.setLoginName( "lisi888");
        c4.setPassword( "123456");
        c4.setUserName("黑马李四");
        c4.setGender( '男');
        c4.setMoney(5000);
        c4.setPhone ( "140140");
        ALL_USERS.add(c4);

        Business b1 = new Business();
        b1.setLoginName ( "baozugong888");
        b1.setPassword( "123456");
        b1.setUserName("黑马包租公");
        b1.setMoney(0);
        b1.setGender('男');
        b1.setPhone( "160160");
        b1.setAddress("火星6号2B二层");
        b1.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b1);
        //注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies1 = new ArrayList<>();
        ALL_MOVIES.put(b1 , movies1);

        Business b2 = new Business();
        b2.setLoginName ( "baozupo888");
        b2.setPassword( "123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setGender('女');
        b2.setPhone( "150150");
        b2.setAddress("火星8号3B二层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        //注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies2);


    }

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static void main(String[] args) {
        showMain();
    }

    /*
        定义一个静态的User类型的变量记住当前登陆成功的用户对象
     */
    public static User loginUser;

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    /**
     * 展示首页
     */
    private static void showMain() {
        while (true){
            System.out.println("=============黑马电影首页==============");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.print("请输入操作命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":       //登录
                    login();
                    break;
                case "2":       //用户注册
                    break;
                case "3":       //商家注册
                    break;
                default:
                    System.out.println("输入有误！！");
            }
        }
    }


    /**
     * 登录界面
     */
    private static void login() {
        while (true) {
            System.out.print("输入登录名称:");
            String name = SYS_SC.nextLine();
            System.out.print("输入登录密码:");
            String password = SYS_SC.nextLine();

            //查询用户对象
            User u = GetUserByLodinName(name);

            //判断登录名是否存在
            if (u != null){
                //比对密码是否正确
                if (u.getPassword().equals(password)){
                    //登陆成功
                    loginUser = u;
                    LOGGER.info(u.getUserName()+"登陆了系统");
                    //判断用户是客户还是商家
                    if (u instanceof Customer){
                        //客户
                        showCustomerMain();
                    }
                    else{
                        //商家
                        showBusinessMain();
                    }
                    return;
                }
                else{
                    //密码输入错误
                    System.out.println("密码输入错误！！！");
                }
            }
            else
                System.out.println("用户名错误！！");
        }
    }

    /**
     * 展示商家界面
     */
    private static void showBusinessMain() {
        System.out. println("============黑马电影客户界面==========");
        LOGGER.info(loginUser.getUserName()+ "查看了自己的详情");
        System.out.println(loginUser.getUserName() + (loginUser.getGender() == '男' ? "先生" : "女士") + "，欢迎您登录");
        System.out.println("1、展示详情");
        System.out.println("2、上架电影");
        System.out.println("3、下架电影");
        System.out.println("4、修改电影");
        System.out.println("5、退出");

        while (true) {
            System.out.print("请输入操作命令:");
            String conmand = SYS_SC.nextLine();
            switch (conmand){
                case "1":
                    ShowBusinessInfos();
                    break;
                case "2":
                    AddMovie();
                    break;
                case "3":
                    DelateMovie();
                    break;
                case "4":
                    UpdateMovie();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入有误！！");
            }
        }
    }

    /**
     * 修改电影
     */
    private static void UpdateMovie() {
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0){
            System.out.println("您当前没有上架的电影");
            return;
        }
        else{
            while (true) {
                //让用户选择要修改的影片
                System.out.println("请输入要修改的电影名称");
                String name = SYS_SC.nextLine();
                //查询影片
                Movie movie =  GetMovieByName(name);
                if (movie != null){
                    System.out.println("请您输入修改后新片名:");
                    String NewName = SYS_SC.nextLine();
                    System.out.println("请您输入修改后主演:");
                    String actor = SYS_SC.nextLine();
                    System.out.println("请您输入修改后时长:");
                    String time = SYS_SC.nextLine();
                    System.out.println("请您输入修改后票价:");
                    String price = SYS_SC.nextLine();
                    System.out.println("请您输入修改后票数:");
                    String totalNumber = SYS_SC.nextLine(); // 200\n
                    while (true) {
                        try {
                            System.out.println("请您输入修改后影片放映时间:");
                            String stime = SYS_SC.nextLine();

                            movie.setName(NewName);
                            movie.setActor(actor);
                            movie.setPrice(Double.valueOf(price));
                            movie.setTime(Double.valueOf(time));
                            movie.setNumber(Integer.valueOf(totalNumber));
                            movie.setStartTime(sdf.parse(stime));
                            System.out.println("恭喜您成功修改《"+movie.getName()+"》");
                            ShowBusinessInfos();
                            return;
                        } catch (ParseException e) {
                            e.printStackTrace();
                            LOGGER.error("时间解析出了错误！！");
                        }
                    }
                }
                else{
                    System.out.println("您的店铺没有上架该影片！");
                    System.out.println("请问继续吗？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command){
                        case "y":
                            break;
                        default:
                            return;
                    }
                }
            }
        }
    }

    /**
     * 下架电影
     */
    private static void DelateMovie() {
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() == 0){
            System.out.println("您当前没有上架的电影");
            return;
        }
        else{
            while (true) {
                //让用户选择要下架的影片
                System.out.println("请输入要下架的电影名称");
                String name = SYS_SC.nextLine();
                //查询影片
                Movie movie =  GetMovieByName(name);
                if (movie != null){
                    movies.remove(movie);
                    System.out.println("下架成功！！");
                    ShowBusinessInfos();
                    return;
                }
                else{
                    System.out.println("您的店铺没有上架该影片！");
                    System.out.println("请问继续吗？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command){
                        case "y":
                            break;
                        default:
                            return;
                    }
                }
            }
        }
    }

    /**
     *  查询当前商家电影
     * @param name 电影名称
     * @return Movie
     */
    private static Movie GetMovieByName(String name) {
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().equals(name))
                return movie;
        }
        return null;
    }


    /**
     * 上架电影
     */
    private static void AddMovie() {
        Business business = (Business)loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请您输入新片名:");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演:");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入时长:");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价:");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数:");
        String totalNumber = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间:");
                String stime = SYS_SC.nextLine();

            //public Movie(String name, String actor,double time, double price, int number, Date startTime) {
                Movie movie = new Movie(name,actor,Double.valueOf(time),Double.valueOf(price),
                        Integer.valueOf(totalNumber),sdf.parse(stime));

                movies.add(movie);

                System.out.println("恭喜您成功上架《"+movie.getName()+"》");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了错误！！");
            }
        }

    }

    /**
     * 展示当前商家的信息
     */
    private static void ShowBusinessInfos() {
        System.out.println("==================商家详情界面=======================");
        //根据商家对象，作为Map的键，提取对应的值就是其排片信息
        //Map<Business, List<Movie>> ALL_MOVIE
        Business business = (Business)loginUser;
        System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:"+business.getAddress());

        List<Movie> movies = ALL_MOVIES.get(loginUser);

        if (movies.size() > 0) {
            System.out.println("片名\t\t\t主演\t\t\t时长\t\t\t评分\t\t\t票价\t\t\t余票数量\t\t\t放映时间");

            for (Movie m : movies) {
                System.out.println(m.getName()+"\t\t\t"+m.getActor() + "\t\t\t" + m.getTime()+"\t\t\t"
                + m.getScore()+"\t\t\t" + m.getPrice()+"\t\t\t"+m.getNumber()+"\t\t\t" +sdf.format(m.getStartTime()));
            }
        } else
            System.out.println("您当前影院无片可播~~~");
    }

    /**
     * 展示客户界面
     */
    private static void showCustomerMain() {
        System.out. println("============黑马电影客户界面==========");
        System.out.println(loginUser.getUserName() + (loginUser.getGender() == '男' ? "先生" : "女士")
                + "，欢迎您登录.余额" + loginUser.getMoney());
        System.out.println("请您选择要操作的功能:");
        System.out.println("1、展示全部影片信息功能:");
        System.out.println("2、根据电影名称查询电影信息:");
        System.out.println("3、评分功能:");
        System.out.println("4、购票功能:");
        System.out.println("5、退出系统:");
        while(true){
            System.out.println("请输入操作命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    ShowAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    BuyMovie();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入错误！！");
                    break;

            }
        }

    }

    /**
     * (客户)购票
     */
    private static void BuyMovie() {
        ShowAllMovies();
        System.out.println("==============用户购票功能===================");
        while (true) {
            System.out.print("请输入需要购票的店铺:");
            String ShopName = SYS_SC.nextLine();
            //判断是否存在该商铺
                Business business = GetShopByName(ShopName);
                if (business == null){
                    System.out.println("对不起，没有找到该商家~~");
                    break;
                }
                else{
                    List<Movie> movies = ALL_MOVIES.get(business);
                    //判断是否有电影上映
                    if (movies.size() > 0){
                        //输入电影名称
                        while (true) {
                            System.out.println("请输入要购买的电影名称");
                            String name = SYS_SC.nextLine();
                            Movie movie = GetMovieByShopAndName(business,name);
                            if(movie != null){
                                //开始购买
                                while (true) {
                                    System.out.print("输入购买的票数：");
                                    String number = SYS_SC.nextLine();
                                    int buyNumber = Integer.valueOf(number);

                                    //判断电影是否购票
                                    if (movie.getNumber() >= buyNumber){
                                        //可以购买
                                        //当前需要花费的金额
                                        double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber)).doubleValue();

                                        if(loginUser.getMoney() >= money){
                                            //可以支付了
                                            System.out.println("您成功购买了"+ movie.getName() +buyNumber
                                            +"张票。总金额是："+money);
                                            //更新自己金额、商家金额
                                            loginUser.setMoney(loginUser.getMoney() - money);
                                            business.setMoney(business.getMoney() + money);
                                            //更新票数
                                            movie.setNumber(movie.getNumber() - buyNumber);
                                            return;

                                        }else{
                                            //钱不够了
                                            System.out.println("您当前余额不够~~");
                                            System.out.println("是否继续买票？ y/n");
                                            String command = SYS_SC.nextLine();
                                            switch (command){
                                                case "y":
                                                    break;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                    else{
                                        //无法购买
                                        System.out.println("您当前最多可以购买" + movie.getNumber()+"张票！");
                                        System.out.println("是否继续买票？ y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command){
                                            case "y":
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                            else{
                                System.out.println("没有该电影~~");

                            }
                        }
                    }
                    else{
                        System.out.println("该电影院关门了~~");
                        System.out.println("是否继续买票？ y/n");
                        String command = SYS_SC.nextLine();
                        switch (command){
                            case "y":
                                break;
                            default:
                                return;
                        }
                    }
                }

        }

    }

    private static Movie GetMovieByShopAndName(Business business,String name) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name))
                return movie;
        }
        return null;
    }

    public static Business GetShopByName(String name){
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business b : businesses) {
            if (b.getShopName().equals(name))
                return b;
        }
        return null;
    }

    /**
     * (客户)查看所有电影
     */
    private static void ShowAllMovies() {
        System.out.println("============展示全部上架影片================");
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:"+business.getAddress());
            System.out.println("片名\t\t\t主演\t\t\t时长\t\t\t评分\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
            for (Movie m : movies) {
                System.out.println(m.getName()+"\t\t\t"+m.getActor() + "\t\t\t" + m.getTime()+"\t\t\t"
                        + m.getScore()+"\t\t\t" + m.getPrice()+"\t\t\t"+m.getNumber()+"\t\t\t" +sdf.format(m.getStartTime()));
            }
        });
    }

    /**
     * 查询登录名是否存在
     * @param name 登录名
     * @return User
     */
    private static User GetUserByLodinName(String name) {
        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(name))
                return user;
        }
        //查无此人
        return null;
    }
}
