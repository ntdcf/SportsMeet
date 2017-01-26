package com.luohao.sportmeet.API;

import com.luohao.sportmeet.AppsData;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by luogkme on 2017/1/22.
 */

public class LinkServer extends Thread {
    private HttpURLConnection httpURLConnection;
    private URL url;
    private ObjectOutputStream objectOutputStream;

    private String HTTPData;

    private void sendData() throws IOException {
        try {
            url = new URL(AppsData.LoginServerURL);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            //设置HTTP协议
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestProperty("Content-type", "application/x-java-serialized-object");

            OutputStream outputStream = httpURLConnection.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("username=121212&password=111111");

            objectOutputStream.writeObject(stringBuffer);
            objectOutputStream.flush();
            httpURLConnection.getInputStream();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

//    private String getHTTPData() {
//        return HTTPData;
//    }
//
//    public void setHTTPData(String HTTPData) {
//        this.HTTPData = HTTPData;
//    }

    @Override
    public void run() {
        try {
            this.sendData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
