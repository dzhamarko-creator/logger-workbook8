package LoggerExercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    final static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logMeLikeYouDo("           _                         _\n" +
                "       _==/          i     i          \\==\n" +
                "     /XX/            |\\___/|            \\XX\\\n" +
                "   /XXXX\\            |XXXXX|            /XXXX\\\n" +
                "  |XXXXXX\\_         _XXXXXXX_         _/XXXXXX|\n" +
                " XXXXXXXXXXXxxxxxxxXXXXXXXXXXXxxxxxxxXXXXXXXXXXX\n" +
                "|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|\n" +
                " XXXXXX/^^^^\"\\XXXXXXXXXXXXXXXXXXXXX/^^^^^\\XXXXXX\n" +
                "  |XXX|       \\XXX/^^\\XXXXX/^^\\XXX/       |XXX|\n" +
                "    \\XX\\       \\X/    \\XXX/    \\X/       /XX/\n" +
                "       \"\\       \"      \\X/      \"       /\" ");
    }

    private static void logMeLikeYouDo(String input) {

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + input);
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + input);
        }

        logger.warn("This is warn : " + input);
        logger.error("This is error : " + input);
        logger.fatal("This is fatal : " + input);
    }
}
