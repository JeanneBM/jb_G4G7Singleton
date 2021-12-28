package test;

import org.junit.Assert;
import org.junit.Test;
import pattern.DeutschWelcome;
/*import pattern.DeutschWelcome;

public class DeutschWelcomeTest {

        @Test
        public void showMessage_ShouldReturn_DeutschWelcome() {
            private static DeutschWelcome instance = new DeutschWelcome();
            public static DeutschWelcome getInstance(){return instance;}
            Assert.assertEquals("Guten Tag! Ich heiße Asia. Auf Wiedersehen!", instance.showMessage());
        }


}
*
 */

public class DeutschWelcomeTest extends DeutschWelcome {
     Assert.assertEquals(DeutschWelcome getInstance(), DeutschWelcome.showMessage());
}