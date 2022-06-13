package mybatisgenerator;

import java.sql.*;

/**
 * @author fl37804
 * @date 2022-06-13
 */
public class OracleJdbcUtil {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conn = null;

        //加载驱动和地址，及地址连接
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String dbURL = "jdbc:oracle:thin:@10.20.38.241:1521/orcl";
        //我使用的是oracle12c，这里是没有scott用户的，我自己新建的用户c##scott
        conn = DriverManager.getConnection(dbURL, "HSRISK5", "HSRISK5");

        System.out.println(conn);
    }

}
