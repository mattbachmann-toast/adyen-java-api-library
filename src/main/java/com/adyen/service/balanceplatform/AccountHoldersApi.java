/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.AccountHolder;
import com.adyen.model.balanceplatform.AccountHolderInfo;
import com.adyen.model.balanceplatform.PaginatedBalanceAccountsResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountHoldersApi extends Service {
    private final String baseURL;

    public AccountHoldersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Get an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder getAccountHolder(String id) throws ApiException, IOException {
        return getAccountHolder(id, null);
    }

    /**
    * Get an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder getAccountHolder(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return AccountHolder.fromJson(jsonResult);
    }

    /**
    * Get all balance accounts of an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @return {@link PaginatedBalanceAccountsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedBalanceAccountsResponse getAllBalanceAccountsOfAccountHolder(String id) throws ApiException, IOException {
        return getAllBalanceAccountsOfAccountHolder(id, null,  null,  null);
    }

    /**
    * Get all balance accounts of an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param offset {@link Integer } Query: The number of items that you want to skip. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedBalanceAccountsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedBalanceAccountsResponse getAllBalanceAccountsOfAccountHolder(String id, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}/balanceAccounts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return PaginatedBalanceAccountsResponse.fromJson(jsonResult);
    }

    /**
    * Update an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param accountHolder {@link AccountHolder }  (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder updateAccountHolder(String id, AccountHolder accountHolder) throws ApiException, IOException {
        return updateAccountHolder(id, accountHolder, null);
    }

    /**
    * Update an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param accountHolder {@link AccountHolder }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder updateAccountHolder(String id, AccountHolder accountHolder, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = accountHolder.toJson();
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return AccountHolder.fromJson(jsonResult);
    }

    /**
    * Create an account holder
    *
    * @param accountHolderInfo {@link AccountHolderInfo }  (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder createAccountHolder(AccountHolderInfo accountHolderInfo) throws ApiException, IOException {
        return createAccountHolder(accountHolderInfo, null);
    }

    /**
    * Create an account holder
    *
    * @param accountHolderInfo {@link AccountHolderInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder createAccountHolder(AccountHolderInfo accountHolderInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = accountHolderInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/accountHolders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return AccountHolder.fromJson(jsonResult);
    }
}
