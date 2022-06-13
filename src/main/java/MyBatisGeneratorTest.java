import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fl37804
 * @date 2022-06-13
 */
public class MyBatisGeneratorTest {
    public static void main(String[] args) throws Exception {
        MyBatisGeneratorTest generatorSqlmap = new MyBatisGeneratorTest();
        generatorSqlmap.testGenerator();
        System.out.println("执行完毕");
    }

    /**
     * @throws Exception
     */
    private static void testGenerator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        /**指向逆向工程配置文件*/
        File configFile = new File(MyBatisGeneratorTest.class.getResource("./generatorConfig.xml").getFile());
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration config = parser.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

}
