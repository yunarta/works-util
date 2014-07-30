package com.mobilesolutionworks.android.util;

import java.io.*;

/**
 * Created by yunarta on 22/1/14.
 */
public class IOUtils
{
    public static void copy(File source, File to) throws FileNotFoundException
    {
        FileInputStream in = new FileInputStream(source);
        FileOutputStream out = new FileOutputStream(to);

        copy(in, out);
        close(in);
        close(out);
    }

    private static void close(Closeable closeable)
    {
        try
        {
            closeable.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static ByteArrayOutputStream consumeAsBuffer(InputStream in) throws IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        byte[] buf = new byte[10240];
        int read;

        while (-1 != (read = in.read(buf)))
        {
            out.write(buf, 0, read);
        }

        return out;
    }

    public static String consumeAsString(InputStream in) throws IOException
    {
        return consumeAsBuffer(in).toString("UTF-8");
    }

    public static boolean copy(InputStream in, OutputStream out)
    {
        try
        {
            byte[] buf = new byte[10240];
            int read;

            while (-1 != (read = in.read(buf)))
            {
                out.write(buf, 0, read);
            }

            return true;
        }
        catch (IOException e)
        {
            return false;
        }
    }

    public static void writeAndClose(byte[] bytes, OutputStream out)
    {
        try
        {
            out.write(bytes);
            out.close();
        }
        catch (IOException localIOException)
        {
        }
    }
}
