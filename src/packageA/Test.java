package packageA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static Logger log = LogManager.getLogger(Test.class.getName());

	public static void main(String[] args) {

		log.debug("debug message");

		log.info("object is precent");
		log.error("object is not present");

		log.fatal("this is fatal");
	}

}
