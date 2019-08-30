package com.promitea.client.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.promitea.client.HasApiClient;
import org.junit.Before;

/**
 * @author rolincova
 * @created 30/08/2019.
 */
public abstract class AbstractRestControllerApiTest
{
    public final static String localhost = "http:localhost:8080";
    public final static String demo = "https://demo.promitea.com";

    protected String startTime;

    @Before
    public void setApi()
    {
        getApiClient().getApiClient().setBasePath(demo + "/api");
        getApiClient().getApiClient().setApiKey(getApiKey());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");

        startTime = ft.format(dNow);
    }

    protected abstract HasApiClient getApiClient();

    protected abstract String getApiKey();
}
