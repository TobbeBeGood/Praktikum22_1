package hasencom.schweizfahrplan.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import hasencom.schweizfahrplan.pojo.APIrespond;
import hasencom.schweizfahrplan.pojo.Userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@org.springframework.stereotype.Service
public class Service {


   private static HttpURLConnection connection;

    public APIrespond getConnection(String start, String ziel) throws Exception {
            BufferedReader reader;
            String line;
            StringBuffer responseContent = new StringBuffer();

            try{
                 URL url= new URL("http://transport.opendata.ch/v1/connections?from="+start+"&to="+ziel);
                 connection = (HttpURLConnection) url.openConnection();

                 connection.setRequestMethod("GET");
                 connection.setConnectTimeout(5000);
                 connection.setReadTimeout(5000);

                 int status = connection.getResponseCode();
                 //System.out.println(status);

                reader = new BufferedReader(new InputStreamReader( (connection.getInputStream())));
                while ((line=reader.readLine())!= null){
                    responseContent.append(line);
                }
                reader.close();

            }    catch (Exception e) {
                }
            connection.disconnect();
        APIrespond result=new APIrespond();
        result.setResponseJSON(responseContent.toString());
        System.out.println(result);

        return result;
        }



    }



