/*
 * Promitea REST API v2
 * Promitea REST API v2
 *
 * OpenAPI spec version: 2.0
 * Contact: support@apitea.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.promitea.client.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.promitea.client.ApiException;
import com.promitea.client.HasApiClient;
import com.promitea.client.model.Document;
import com.promitea.client.model.Item;
import com.promitea.client.model.Phase;
import com.promitea.client.model.Project;
import com.promitea.client.model.ProjectBasicInfo;
import com.promitea.client.model.Text;
import com.promitea.client.model.User;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.junit.Assert;
import org.junit.Test;

/**
 * API tests for ProjectRestControllerApi
 */
public class ProjectRestControllerApiTest extends AbstractRestControllerApiTest
{
    private final ProjectRestControllerApi api = new ProjectRestControllerApi();

    @Test
    public void authorizationFailed()
    {
        api.getApiClient().setApiKey("0");

        try
        {
            api.listUsingGET();

            Assert.fail();
        }
        catch (ApiException e)
        {
            Assert.assertEquals(403, e.getCode());
        }
    }

    /**
     * Creates the new project in Promitea
     * <p>
     * Returns project detail
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addProjectUsingPOSTTest() throws ApiException, IOException
    {
        Project projectModel = new Project();

        projectModel.setName(getText("Test - " + startTime));
        projectModel.setExternalId("123");

        User manager = new User();
        projectModel.setManager(manager);

        Phase phase = new Phase();
        phase.setCode("RFQ");

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String deliveryDate = ft.format(new Date());

        // items
        List<Item> items = new ArrayList<>();

        Item item1 = new Item();
        item1.setName(getText("Item 1"));
        item1.addAdditionalNamesItem(getText("Item 1", "en"));
        item1.setDescription(getText("item 1 description"));
        item1.setMeasureUnit("bag");
        item1.setQuantity(new BigDecimal(10));
        item1.setDeliveryDate(deliveryDate);
        items.add(item1);

        Item item2 = new Item();
        item2.setName(getText("Item 2"));
        item2.addAdditionalNamesItem(getText("Item 2", "en"));
        item2.setDescription(getText("item 2 description"));
        item2.setMeasureUnit("pcs");
        item2.setQuantity(new BigDecimal(11));
        items.add(item2);

        Item group = new Item();
        group.setName(getText("Group"));
        group.addAdditionalNamesItem(getText("Group", "en"));
        group.setDescription(getText("group description"));
        items.add(group);

        Item subItem = new Item();
        subItem.setName(getText("Sub item"));
        subItem.addAdditionalNamesItem(getText("sub item", "en"));
        subItem.setDescription(getText("sub item description"));
        subItem.setMeasureUnit("pcs");
        subItem.setQuantity(new BigDecimal(12));
        group.setItems(Collections.singletonList(subItem));

        phase.setItems(items);

        // documents
        List<Document> documents = new ArrayList<>();

        Document document1 = new Document();
        document1.name("doc1");
        document1.setMimeType("text");
        document1.setData("data 1");
        document1.setType("document");
        documents.add(document1);

        Document document2 = new Document();
        document2.name("doc2");
        document2.setMimeType("url");
        document2.setData("google.com");
        item1.setDocuments(Collections.singletonList(document2));

        Document pdfDocument = new Document();
        pdfDocument.name("test-document");
        pdfDocument.setMimeType("application/pdf");
        pdfDocument.setFileName("test-document.pdf");

        String data = getDataDocument();
        pdfDocument.setData(data);
        documents.add(pdfDocument);

        phase.setDocuments(documents);

        projectModel.setPhases(Collections.singletonList(phase));

        Project response = api.addProjectUsingPOST(projectModel);

        Assert.assertNotNull(response);
        Assert.assertEquals("Test - " + startTime, response.getName().getValue());
        Assert.assertEquals("tender", response.getProjectType());
        Assert.assertEquals("123", response.getExternalId());
        Assert.assertNotNull(response.getManager());
        Assert.assertEquals("manager1@apitea.com", response.getManager().getEmail());

        Assert.assertEquals(1, response.getPhases().size());

        Phase resultPhase = response.getPhases().get(0);
        Assert.assertEquals("RFQ", resultPhase.getCode());

        List<Item> resultItems = resultPhase.getItems();
        Assert.assertEquals(3, resultItems.size());

        Item resultItem1 = resultItems.stream().filter(i ->
                "Item 1".equals(i.getName().getValue())).findFirst().orElse(null);

        Assert.assertNotNull(resultItem1);
        Assert.assertEquals(new BigDecimal(10), resultItem1.getQuantity());
        Assert.assertEquals("item 1 description", resultItem1.getDescription().getValue());
        Assert.assertEquals("bag", resultItem1.getMeasureUnit().toLowerCase());
        Assert.assertEquals(1, resultItem1.getDocuments().size());
        Assert.assertEquals("doc2", resultItem1.getDocuments().get(0).getName());
        Assert.assertEquals("url", resultItem1.getDocuments().get(0).getMimeType());
        Assert.assertEquals("google.com", resultItem1.getDocuments().get(0).getData());
        Assert.assertEquals(deliveryDate, resultItem1.getDeliveryDate());

        Item resultGroup = resultItems.stream().filter(i ->
                "Group".equals(i.getName().getValue())).findFirst().orElse(null);

        Assert.assertNotNull(resultGroup);
        Assert.assertEquals(1, resultGroup.getItems().size());
        Assert.assertEquals("Sub item", resultGroup.getItems().get(0).getName().getValue());
        Assert.assertEquals(new BigDecimal(12), resultGroup.getItems().get(0).getQuantity());
        Assert.assertEquals("sub item description", resultGroup.getItems().get(0).getDescription().getValue());
        Assert.assertEquals("pcs", resultGroup.getItems().get(0).getMeasureUnit());

        Assert.assertEquals(2, resultPhase.getDocuments().size());

        Document resultDocument = resultPhase.getDocuments().stream().filter(d ->
                "test-document".equals(d.getName())).findFirst().orElse(null);

        Assert.assertNotNull(resultDocument);
        Assert.assertEquals("test-document.pdf", resultDocument.getFileName());
        Assert.assertEquals("application/pdf", resultDocument.getMimeType());
        Assert.assertEquals(data, resultDocument.getData());
    }

    /**
     * Fail creation of the new project in Promitea because a user which has no permission to create one
     * <p>
     */
    @Test
    public void addProjectFailManagerUsingPOSTTest()
    {
        Project projectModel = new Project();

        projectModel.setName(getText("Test - " + startTime + "_2"));

        User manager = new User();
        manager.setEmail("observer1@apitea.com");
        projectModel.setManager(manager);

        try
        {
            api.addProjectUsingPOST(projectModel);

            Assert.fail();
        }
        catch (ApiException e)
        {
            Assert.assertEquals(500, e.getCode());
            Assert.assertTrue(e.getResponseBody().contains("has no permission to create project"));
        }
    }

    /**
     * Fail creation of the new project in Promitea because a type which is not allowed for organization
     * <p>
     */
    @Test
    public void addProjectFailProjectTypeUsingPOSTTest()
    {
        Project projectModel = new Project();

        projectModel.setName(getText("Test - " + startTime + "_3"));
        projectModel.setProjectType("eVergabeRequest");

        try
        {
            api.addProjectUsingPOST(projectModel);

            Assert.fail();
        }
        catch (ApiException e)
        {
            Assert.assertEquals(500, e.getCode());
            Assert.assertTrue(e.getResponseBody().contains("not available for organization"));
        }
    }

    /**
     * Get project list from Promitea
     * <p>
     * Returns project header list from Promitea
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUsingGETTest() throws ApiException
    {
        List<ProjectBasicInfo> response = api.listUsingGET();

        Assert.assertFalse(response.isEmpty());
    }

    /**
     * Get project detail from Promitea
     * <p>
     * Returns project detail
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showProjectUsingGETTest() throws ApiException
    {
        Long id = 17295332L;
        Project response = api.showProjectUsingGET(id);

        Assert.assertNotNull(response);
        Assert.assertEquals("Testing project", response.getName().getValue());
    }

    /**
     * Check error when try to access to tender of another organization from Promitea
     * <p>
     */
    @Test
    public void showProjectFailUsingGETTest()
    {
        Long id = 17207452L;

        try
        {
            api.showProjectUsingGET(id);

            Assert.fail();
        }
        catch (ApiException e)
        {
            Assert.assertEquals(500, e.getCode());
            Assert.assertTrue(e.getResponseBody().contains("was not found"));
        }
    }

    private Text getText(String value, String language)
    {
        Text text = new Text();
        text.setValue(value);
        text.setLanguage(language);

        return text;
    }

    private Text getText(String value)
    {
        return getText(value, "en");
    }

    private String getDataDocument() throws IOException
    {
        File file = new File("src/test/resources/test-document.pdf");
        InputStream inputStream = inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes, 0, bytes.length);
        inputStream.close();
        return Base64.encode(bytes);
    }

    @Override
    protected HasApiClient getApiClient()
    {
        return api;
    }

    @Override
    protected String getApiKey()
    {
        return "123456789";
    }
}
