package JavaPrograms;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRCodeGen {
    public static void main(String arg[]) throws Exception
    {
        String display = "SUP BIAAATCH";
        ByteArrayOutputStream out = QRCode.from(display).to(ImageType.JPG).stream();
        File f  = new File("QRGen");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }
}
