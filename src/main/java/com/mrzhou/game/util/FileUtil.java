package com.mrzhou.game.util;


import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;

/**
 * 类说明：文件读写工具类
 * 创建者：Zeros
 * 创建时间：2019-03-29 10:06
 * 包名：com.mrzhou.game.util
 */

public class FileUtil {

    /**
     * 读文件
     * @param path 相对路径 如 cache/path.json
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T readFile(String path, Class<T> tClass){
        try {
            InputStream stream = FileUtil.class.getResourceAsStream("/"+path);
            String content = IOUtils.toString(stream, "UTF-8");
            System.out.println("content:"+content);
            return JSON.parseObject(content, tClass);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 读文件
     * @param path 相对路径 如 cache/path.json
     * @return
     */
    public static String readFile(String path){
        try {
            InputStream stream = FileUtil.class.getResourceAsStream("/"+path);
            String content = IOUtils.toString(stream, "UTF-8");
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 写文件
     * @param path 相对路径 如 cache/path.json
     * @param content 内容
     */
    public static void writeFile(String path, String content){
        try {
            URL resource = FileUtil.class.getClassLoader().getResource(path);
            File f = new File(resource.getPath());
            OutputStream out = new FileOutputStream(f);
            IOUtils.write(content, out);
            IOUtils.closeQuietly(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
