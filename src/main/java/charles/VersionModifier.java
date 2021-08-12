package charles;


public abstract class VersionModifier {

    private static String mSavePath = null;
    private static String mOriginJar = null;
    public VersionModifier(String originJar, String savePath){
        mSavePath = savePath;
        mOriginJar = originJar;
    }
    public abstract boolean modifyByteCode();
    public abstract String getSourcePath();

    public final String getTempPath(){
        return mSavePath;
    }

    protected final String getOriginJarPath(){
        return mOriginJar;
    }

}
