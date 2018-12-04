package lessson16;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class LaunchStatExternalizable implements Externalizable {
    private static final long seriaVersionUID = 0L;
    private static final int VERSION = 1;

    private int launchCount;
    private Date lastLaunch;
    //    private String lastUser;  // добавили lastUser


    public void update() {
        launchCount++;
        lastLaunch = new Date();
//        lastUser = System.getProperty("user.name"); // добавили lastUser
    }

    public boolean isFirstLaunch() {
        return launchCount == 0 && lastLaunch == null;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(VERSION);
        out.writeInt(launchCount);
        out.writeObject(lastLaunch);
//        out.writeUTF(lastUser); // добавили lastUser
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int version = in.readInt();
        if (version > VERSION)
            throw new IOException("Версие не подерживается: " + version);
        launchCount = in.readInt();
        lastLaunch = (Date) in.readObject();
//        if (version > 0) {
//            lastUser = in.readUTF(); // добавили lastUser
//        }
    }

    @Override
    public String toString() {
        return "LaunchStatExternalizable{" +
                "launchCount=" + launchCount +
                ", lastLaunch=" + lastLaunch +
                '}';
    }
}
