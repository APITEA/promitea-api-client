# promitea-api-client
Promitea java API client for integration other system with Promitea.

## About Promitea

Promitea is a online platform for your electronic procurement

Supplier Relationship Management (SRM) helps with planning and communication between the purchaser and supplier. It analyzes their cooperation, lowers possible risks, and brings advantages to both sides.

e-Sourcing makes requests, projects, and auctions easier. Based on selected criteria it automatically, and in real time, evaluates the supplier’s bids.

With help from Purchase to Pay (P2P) you automate the operative purchasing process and lower costs.

## Prerequisites

API key has to be prepared in testing environment and assigned to a testing user. 

## Running the tests

There is prepared several tests for checking Promitea API. You can run them through maven command test.

```
mvn test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Example

```java
ProjectRestControllerApi api = new ProjectRestControllerApi();
api.getApiClient().setApiKey("YOUR_KEY");

List<ProjectBasicInfo> response = api.listUsingGET();
```

## Authors

* **Pavlina Rolincova** - *Initial work* - [APITEA Technologies s.r.o.](https://github.com/APITEA)
* **Marek Matus** - *Initial work* - [APITEA Technologies s.r.o.](https://github.com/APITEA)