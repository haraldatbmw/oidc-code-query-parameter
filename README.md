# oidc-code-query-parameter project

Reproducer for Quarkus OIDC issue in combination with REST-API that uses a query-parameter with name code.

Steps to reprocude:

1. Edit `application.properties` and fill in provider, client-id and secret of your OIDC provider.
2. Start tests:

    ```bash
    mvn test
    ```
