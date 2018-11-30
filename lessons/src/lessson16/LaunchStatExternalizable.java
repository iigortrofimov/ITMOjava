package lessson16;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class LaunchStatExternalizable implements Externalizable {

    private int launchCount;
    private Date lastLaunch;

    private static final long seriaVersionUID = 0L;
    private static final int VERSION = 0;

    public void update() {
        launchCount++;
        lastLaunch = new Date();
    }

    public boolean isFirstLaunch(){
        return launchCount ==0 && lastLaunch == null;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {


    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    @Override
    public String toString() {
        return "LaunchStatExternalizable{" +
                "launchCount=" + launchCount +
                ", lastLaunch=" + lastLaunch +
                '}';
    }
}
