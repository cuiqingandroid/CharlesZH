package charles.version461.modifiers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ClassFileModifier {
    public static void copySource(String sourcePath,String savePath){
        System.out.println();
        copy(sourcePath, sourcePath, savePath);
    }

    private static void copy(String originSourcePath, String sourcePath,String savePath){
        File sourceFile = new File(sourcePath);
        File[] childFiles = sourceFile.listFiles();
        if (childFiles != null){
            for (File file : childFiles){
                if (file.isFile()){
                    try {
                        File destFile = new File(savePath, file.getAbsolutePath().replace(originSourcePath, ""));
                        if (!destFile.getParentFile().exists()){
                            destFile.getParentFile().mkdirs();
                        }
                        Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (file.isDirectory()){
                    copy(originSourcePath, file.getAbsolutePath(), savePath);
                }

            }
        }
    }
}
